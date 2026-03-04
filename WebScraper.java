import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class WebScraper {

    private static final String URL = "https://books.toscrape.com/";

    public static void main(String[] args) {

        try {
            System.out.println("Connecting to website...");

            // Connect to website
            Document doc = Jsoup.connect(URL)
                    .userAgent("Mozilla/5.0")
                    .timeout(6000)
                    .get();

            // Select products
            Elements products = doc.select("article.product_pod");

            // Create CSV file
            FileWriter writer = new FileWriter("products.csv");

            // CSV Header
            writer.append("Name,Price,Rating\n");

            for (Element product : products) {

                // Product Name
                String name = product.select("h3 a").attr("title");

                // Price
                String price = product.select(".price_color").text();

                // Rating
                String ratingClass = product.select(".star-rating").attr("class");
                String rating = ratingClass.replace("star-rating", "").trim();

                // Write to CSV
                writer.append(name.replace(",", " "))
                        .append(",")
                        .append(price)
                        .append(",")
                        .append(rating)
                        .append("\n");
            }

            writer.flush();
            writer.close();

            System.out.println(" Data scraped successfully!");
            System.out.println("CSV file created: products.csv");

        } catch (IOException e) {
            System.out.println(" Error occurred: " + e.getMessage());
        }
    }
}