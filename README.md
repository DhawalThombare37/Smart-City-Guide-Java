<h1 align="center">🏙️ Smart City Guide</h1>
<h3 align="center">A JavaFX-based interactive city navigation and services application</h3>

<p align="center">
An intelligent Smart City Guide system built using <b>Java</b> and <b>JavaFX</b>, offering users a seamless way to explore city attractions, book packages, view hotels, check destinations, and access essential city services.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge" />
  <img src="https://img.shields.io/badge/JavaFX-UI%20Framework-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/MySQL-Database-4479A1?style=for-the-badge" />
  <img src="https://img.shields.io/badge/MVC-Architecture-green?style=for-the-badge" />
  <img src="https://img.shields.io/badge/IDE-NetBeans-lightgrey?style=for-the-badge" />
</p>

---

# 📌 Overview

The **Smart City Guide** is a desktop application designed to help users navigate and explore a city digitally.  
With features ranging from booking hotels and tour packages to viewing destinations and customer details, the system acts as a centralized directory for tourism and city services.

---

# ✨ Key Features

### 🗺️ City Navigation Modules
- Explore popular **destinations**
- View hotels, packages, attractions
- Smart search experience

### 🛒 Booking & Customer Management
- Book hotel rooms  
- Reserve travel packages  
- View/update customer details  

### 💼 Integrated City Services
- Payment interface (UI only)
- Dashboard with quick actions  
- Account creation & login screens  

### 🎨 Modern JavaFX UI
- Clean layout  
- Custom icons  
- Animated splash screen  

---

# 📁 Project Structure
```
Smart-City-Guide-Java/
│
├── src/
│ ├── smart/city/guide/
│ │ ├── About.java
│ │ ├── AddCustomer.java
│ │ ├── BookHotel.java
│ │ ├── BookPackage.java
│ │ ├── CheckHotels.java
│ │ ├── Conn.java
│ │ ├── Dashboard.java
│ │ ├── Destinations.java
│ │ ├── Login.java
│ │ ├── Payment.java
│ │ ├── Signup.java
│ │ ├── Splash.java
│ │ └── ViewCustomer.java
│ │
│ ├── icons/
│ └── (UI icons and images)
├── .gitignore
├── LICENSE
└── README.md
```
---

# 🗄️ Database Configuration (Safe for Public Repo)

Your `Conn.java` **must not include credentials**.  
Use placeholders:

```java
String url = "jdbc:mysql://<HOST>/<DB_NAME>";
String user = "<USERNAME>";
String pass = "<PASSWORD>";
```

---

# 🛠️ How to Run the Project

### ✔ Requirements

- Java 17+
- JavaFX SDK
- MySQL (optional, only for DB-enabled features)
- IDE: NetBeans / IntelliJ / VS Code

### ▶️ Run using IDE

- 1.Open the project
- 2.Ensure JavaFX SDK is configured in libraries
- 3.Run Splash.java

---

# 🖼️ Screenshots
add images 

---

# 🔮 Future Enhancements

- 🌐 Real-time map integration
- 🏨 API-based hotel data
- 📍 GPS-based suggestions
- 📲 Android version using Flutter
- ☁️ Cloud database support (Firebase/Supabase)

---

# ⭐ Support This Project
If you like Smart City Guide, or found it helpful for learning JavaFX,
please consider giving it a star ⭐

<p align="center"> <img src="https://img.shields.io/github/stars/DhawalThombare37/Smart-City-Guide-Java?style=social" /> </p>

---
# 📄 License
MIT License
---






