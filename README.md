# 💳 Payment Adapter playground (Spring Boot + Maven)

This project demonstrates the **Adapter Design Pattern** in Java using **Spring Boot** and **Maven**.  
It shows how to manage **multiple third-party payment integrations** (PayPal, Stripe) through a **unified interface** — without changing your core business logic.

---

## 🧠 Overview

When integrating multiple third-party systems (like payment providers), each service usually has its **own SDK or API format**.  
The **Adapter Pattern** helps by creating a **common interface** and **adapter classes** that translate between your system and each external service.

This approach:
- Keeps your business logic **clean and independent**
- Makes it **easy to add new providers** in the future
- Reduces **code duplication** and integration complexity

---

## ⚙️ Technologies Used

- **Java 17+**
- **Spring Boot 3.3.x**
- **Maven**
- REST API (Spring Web)

---

## 🚀 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/Samira1462/payment-adapter-playground.git
   cd payment-adapter-playground


