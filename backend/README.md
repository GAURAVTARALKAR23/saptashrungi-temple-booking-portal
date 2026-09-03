# Saptashrungi Temple Backend

Spring Boot 3.x REST API Backend for Saptashrungi Temple Booking Portal

## Technologies Used

- **Java 21**
- **Spring Boot 3.3.0**
- **Spring Security with JWT**
- **Spring Data JPA + Hibernate**
- **PostgreSQL**
- **Razorpay Payment Gateway**
- **Lombok**
- **Maven**

## Project Structure

```
backend/
├── src/main/java/com/templeapp/backend/
│   ├── entity/           # JPA Entities
│   ├── repository/       # Data Access Layer
│   ├── service/          # Business Logic
│   ├── controller/       # REST Controllers
│   ├── dto/              # Data Transfer Objects
│   ├── config/           # Configuration
│   ├── security/         # Security Configuration
│   ├── exception/        # Custom Exceptions
│   └── SaptashrungiBackendApplication.java
├── src/main/resources/
│   ├── application.properties
│   └── application-dev.properties
└── pom.xml
```

## Setup Instructions

### Prerequisites
- Java 21 installed
- PostgreSQL 13+ installed and running
- Maven 3.8+ installed

### Database Setup

1. Create PostgreSQL database:
```sql
CREATE DATABASE saptashrungi_db;
```

2. Update `application.properties` with your database credentials:
```properties
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Build & Run

1. Install dependencies:
```bash
mvn clean install
```

2. Run the application:
```bash
mvn spring-boot:run
```

3. Access the API:
- Base URL: `http://localhost:8080/api`
- Health Check: `http://localhost:8080/api/health`

## API Endpoints (To be implemented)

### Authentication
- `POST /auth/register` - Register new user
- `POST /auth/login` - Login user
- `POST /auth/refresh` - Refresh JWT token
- `POST /auth/logout` - Logout user

### Bookings
- `GET /bookings` - Get all bookings
- `GET /bookings/:id` - Get booking by ID
- `POST /bookings` - Create new booking
- `PUT /bookings/:id` - Update booking
- `DELETE /bookings/:id` - Cancel booking

### Donations
- `GET /donations` - Get all donations
- `POST /donations` - Create donation
- `GET /donations/:id` - Get donation by ID

### Admin
- `GET /admin/dashboard` - Admin dashboard
- `GET /admin/users` - Manage users
- `GET /admin/bookings` - Manage bookings
- `GET /admin/donations` - Manage donations

## Configuration

### JWT Configuration
Update in `application.properties`:
```properties
jwt.secret=your_jwt_secret_key_here_min_256_bits
jwt.expiration=86400000
```

### Razorpay Configuration
Update in `application.properties`:
```properties
razorpay.key.id=your_razorpay_key_id
razorpay.key.secret=your_razorpay_key_secret
```

## Development

### Running Tests
```bash
mvn test
```

### Code Style
- Use Lombok to reduce boilerplate
- Follow Spring naming conventions
- Add validation annotations to entities

## Next Steps

1. Implement Repository interfaces
2. Create Service layer classes
3. Develop REST Controllers
4. Add Security configuration with JWT
5. Implement Razorpay integration
6. Write unit and integration tests
7. Deploy to production

## Contact

For issues or questions, contact the development team.
