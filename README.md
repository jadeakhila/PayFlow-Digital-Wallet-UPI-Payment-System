
# PhonePe Clone – Digital Wallet Backend (Spring Boot)

## 📌 Overview

This project is a **backend implementation of a PhonePe-like digital wallet system** built using **Spring Boot, Java, and MySQL**.

The application allows users to:

* Register in the system
* Automatically create a wallet
* Add money to the wallet
* Transfer money to another user
* Record transactions

This project demonstrates **REST API development, database integration using Spring Data JPA, and fintech backend architecture.**

---

## 🚀 Features

* User Registration
* Automatic Wallet Creation
* Add Money to Wallet
* Peer-to-Peer Money Transfer
* Transaction Recording
* RESTful API architecture
* MySQL Database Integration

---

## 🛠 Technologies Used

* **Java 21**
* **Spring Boot**
* **Spring Data JPA**
* **Hibernate**
* **MySQL**
* **Maven**
* **Postman (API Testing)**

---

## 📂 Project Structure

src/main/java/com/example/phonepeclone

controller
    UserController.java
    WalletController.java

model
    User.java
    Wallet.java
    Transaction.java

repository
    UserRepository.java
    WalletRepository.java
    TransactionRepository.java

service
    WalletService.java

PhonepeCloneApplication.java

---

## 🗄 Database Tables

### User

| Column   | Description   |
| -------- | ------------- |
| id       | User ID       |
| name     | User name     |
| phone    | Phone number  |
| password | User password |
| upi_id   | UPI ID        |

### Wallet

| Column  | Description    |
| ------- | -------------- |
| id      | Wallet ID      |
| balance | Wallet balance |
| user_id | Linked user    |

### Transaction

| Column      | Description        |
| ----------- | ------------------ |
| id          | Transaction ID     |
| sender_id   | Sender             |
| receiver_id | Receiver           |
| amount      | Amount transferred |
| status      | Transaction status |
| date        | Transaction time   |

---

## 🔗 API Endpoints

### Register User

POST
/users/register

Example Request:

```json
{
"name": "Akhila",
"phone": "9999999999",
"password": "1234",
"upiId": "akhila@upi"
}
```

---

### Add Money to Wallet

POST

/wallet/add-money?userId=1&amount=500

---

### Send Money

POST

/transaction/send

Example Request:

```json
{
"senderId": 1,
"receiverId": 2,
"amount": 200
}
```

---

## ⚙ Setup Instructions

### 1. Clone the repository

```
git clone https://github.com/yourusername/phonepe-clone.git
```

### 2. Create MySQL database

```
CREATE DATABASE phonepe;
```

### 3. Configure database

Edit **application.properties**

```
spring.datasource.url=jdbc:mysql://localhost:3306/phonepe
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Run the application

Run:

```
PhonepeCloneApplication.java
```

Server runs at:

```
http://localhost:8080
```

---

## 🧪 Testing APIs

Use **Postman** to test the APIs.

Example workflow:

1. Register User
2. Add Money to Wallet
3. Send Money to Another User
4. Check Wallet Balance
5. View Transactions

---

## 📈 Future Enhancements

* JWT Authentication
* React or Angular Frontend
* QR Code Payments
* Transaction History Dashboard
* Mobile App Integration

---

## 👩‍💻 Author

Akhila
BTech – Artificial Intelligence & Machine Learning
