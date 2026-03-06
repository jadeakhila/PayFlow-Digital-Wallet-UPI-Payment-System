PhonePe Clone – Digital Wallet Backend (Spring Boot)
📌 Project Description

This project is a backend implementation of a PhonePe-like digital wallet system developed using Spring Boot, Java, and MySQL.

The application allows users to register, automatically creates a wallet for each user, enables adding money to the wallet, and supports peer-to-peer money transfer functionality similar to UPI-based payment systems.

This project demonstrates REST API development, database integration using JPA/Hibernate, and backend architecture for fintech applications.

🚀 Features

User Registration
Automatic Wallet Creation
Add Money to Wallet
Wallet Balance Management
Peer-to-Peer Money Transfer
Transaction Recording
RESTful APIs
MySQL Database Integration

🛠 Technologies Used
Technology	Purpose
Java 21	Backend programming
Spring Boot	Application framework
Spring Data JPA	Database interaction
Hibernate	ORM
MySQL	Database
Maven	Dependency management
Postman	API testing

📂 Project Structure
src/main/java/com/example/phonepeclone

controller
 ├── UserController.java
 └── WalletController.java

model
 ├── User.java
 ├── Wallet.java
 └── Transaction.java

repository
 ├── UserRepository.java
 ├── WalletRepository.java
 └── TransactionRepository.java

service
 └── WalletService.java

PhonepeCloneApplication.java



🔗 API Endpoints
Register User
POST
/users/register
Example Request

{
"name": "Akhila",
"phone": "9999999999",
"password": "1234",
"upiId": "akhila@upi"
}
Add Money to Wallet

POST
/wallet/add-money?userId=1&amount=500
Send Money

POST
/transaction/send

Example Request

{
"senderId": 1,
"receiverId": 2,
"amount": 200
}

⚙ Setup Instructions
1️⃣ Clone the Repository
git clone https://github.com/yourusername/phonepe-clone.git
2️⃣ Create MySQL Database
CREATE DATABASE phonepe;
3️⃣ Configure Database

Edit application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/phonepe
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
4️⃣ Run Application

Run

PhonepeCloneApplication.java

Server will start at

http://localhost:8080
🧪 API Testing

Use Postman to test APIs.
Example workflow
Register User
Add Money to Wallet
Transfer Money
Check Wallet Balance
View Transactions

📈 Future Enhancements

JWT Authentication
Frontend UI (React / Angular)
QR Code Payments
Transaction History API
Payment Gateway Integration
Mobile App (Android / Flutter)

👩‍💻 Author

Akhila
BTech – Artificial Intelligence & Machine Learning
