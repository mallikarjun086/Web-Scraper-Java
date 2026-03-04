# 🌐 Web Scraper using Java (JSoup)

### Prodigy Infotech Internship — Task 05

## 📌 Project Overview

This project is a **Web Scraping application built using Java and the JSoup library** as part of **Task-05 of the Prodigy Infotech Software Development Internship**.

The program connects to a website, extracts product information such as **name, price, and rating**, and stores the extracted data in a **CSV file** for structured data storage and analysis.

The goal of this project is to demonstrate how **web data can be programmatically extracted, processed, and stored using Java**.

---

## 🚀 Features

* 🌍 Connects to a live website using JSoup
* 🔎 Extracts product information from HTML pages
* 📦 Scrapes **product name, price, and rating**
* 📊 Stores extracted data in **CSV format**
* ⚡ Uses **CSS selectors for efficient parsing**
* 🧹 Clean and modular Java implementation
* 📁 Automatically generates an output CSV file

---

## 🛠 Technologies Used

* **Java**
* **JSoup Library**
* **HTML Parsing**
* **File Handling (CSV)**
* **Object-Oriented Programming**

---

## 📂 Project Structure

```
Web-Scraper-Java
│
├── WebScraper.java
├── README.md
└── .gitignore
```

---

## ⚙️ How the Program Works

1. The program connects to the target website using **JSoup**.
2. The HTML document of the webpage is downloaded.
3. Specific HTML elements are selected using **CSS selectors**.
4. Product details such as **name, price, and rating** are extracted.
5. The extracted data is written to a **CSV file**.

---

## ▶️ How to Run the Project

### 1️⃣ Download JSoup Library

Download JSoup from:

https://jsoup.org/download

Place the `.jar` file inside the project folder.

---

### 2️⃣ Compile the Program

```bash
javac -cp ".;jsoup.jar" WebScraper.java
```

---

### 3️⃣ Run the Program

```bash
java -cp ".;jsoup.jar" WebScraper
```

---

## 📊 Example Output

The program generates a file called:

```
products.csv
```

Example:

```
Name,Price,Rating
A Light in the Attic,£51.77,Three
Tipping the Velvet,£53.74,One
Soumission,£50.10,One
```

---

## 💡 Learning Outcomes

Through this project I learned:

* How web scraping works
* Parsing HTML documents using **JSoup**
* Extracting structured data from web pages
* Writing data to **CSV files**
* Building modular and maintainable Java applications

---

## 👨‍💻 Author

**Mallikarjun Gala**
Software Development Intern — Prodigy Infotech

---

## ⭐ Acknowledgement

This project was developed as part of the **Prodigy Infotech Internship Program** to improve practical knowledge in **web scraping and Java programming**.
