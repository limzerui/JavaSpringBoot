# E-Commerce Full Stack Application

A modern e-commerce application built with Spring Boot and React, featuring a robust backend architecture and a responsive frontend interface.

## 🛠️ Technology Stack

### Backend (Spring Boot 3.5.0)
- **Java 21**: Latest LTS version for optimal performance and features
- **Spring Boot**: Core framework for building the application
- **Spring Data JPA**: For database operations and ORM
- **Spring Web**: RESTful web services support
- **H2 Database**: In-memory database for development
- **Lombok**: Reduces boilerplate code
- **Spring Boot DevTools**: Enhanced development experience

### Frontend (React + Vite)
- **React**: Modern UI library
- **Vite**: Next-generation frontend tooling
- **Axios**: HTTP client for API communication
- **Context API**: State management
- **CSS**: Styling and responsive design

## 🏗️ Project Structure

### Backend Architecture
```
src/main/java/com/zerui/ecom_proj/
├── controller/    # REST API endpoints
├── model/        # Entity classes
├── repo/         # Data access layer
├── service/      # Business logic
└── EcomProjApplication.java
```

## 🚀 Getting Started

### Prerequisites
- Java 21 or higher
- Maven
- Node.js and npm (for frontend)

### Backend Setup
1. Clone the repository
2. Navigate to the backend directory:
   ```bash
   cd ecom-proj
   ```
3. Install dependencies:
   ```bash
   mvn install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

### Frontend Setup
1. Navigate to the frontend directory:
   ```bash
   cd ecom-frontend-5
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the development server:
   ```bash
   npm run dev
   ```

## 🔧 Key Features
- RESTful API architecture
- JPA-based data persistence
- In-memory H2 database for development
- Lombok for reduced boilerplate
- Hot reload support with Spring Boot DevTools
- Component-based frontend architecture
- State management with Context API
- Responsive design

## 🛠️ Development Tools
- Spring Boot DevTools for enhanced development experience
- Maven for dependency management
- Vite for frontend development
- ESLint for code quality

## 📚 API Documentation
The API documentation will be available at:
- Swagger UI: `http://localhost:8080/swagger-ui.html` (when implemented)
- API Endpoints: `http://localhost:8080/api/v1`

## 🔐 Security
- Spring Security (can be implemented as needed)
- CORS configuration
- Input validation
- Secure password handling

## 🧪 Testing
- JUnit for unit testing
- Spring Boot Test for integration testing
- Test coverage with JaCoCo (can be implemented)

## 📦 Deployment
The application can be deployed using:
- Docker containers
- Traditional deployment methods
- Cloud platforms (AWS, Azure, GCP)