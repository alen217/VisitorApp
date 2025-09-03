# VisitorApp

VisitorApp is a Java-based application designed for efficient and secure visitor management. The app leverages API calls to store and manage visitor data, making it suitable for offices, schools, events, and other premises requiring guest tracking and record keeping.

## Features

- **Visitor Check-in/Check-out:**  
  Digital system for registering and tracking visitor entry and exit.

- **Data Storage via APIs:**  
  Visitor information and event logs are stored securely using API integrations.

- **Real-time Visitor Logs:**  
  Access up-to-date records of all visitors.

- **Customizable Forms:**  
  Easily modify the information collected during check-in.

- **Security and Privacy:**  
  Ensures visitor data is managed in compliance with privacy standards.

## Technologies Used

- **Language:** Java
- **Build System:** Gradle (with Kotlin DSL)
- **API Communication:** RESTful API calls for data storage and retrieval

## Project Structure

```plaintext
VisitorApp/
│
├── app/                # Main application source code (Java)
├── gradle/             # Gradle wrapper and support files
├── .idea/              # IDE configuration files
├── build.gradle.kts    # Project build configuration (Kotlin DSL)
├── settings.gradle.kts # Gradle settings
├── gradle.properties   # Gradle properties and environment settings
├── gradlew             # Gradle wrapper script (Unix)
├── gradlew.bat         # Gradle wrapper script (Windows)
└── .gitignore          # Git file ignore rules
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK 8+)
- Gradle (or use the provided wrapper scripts)

### Installation

1. **Clone the repository**
   ```sh
   git clone https://github.com/alen217/VisitorApp.git
   cd VisitorApp
   ```

2. **Build the project**
   ```sh
   ./gradlew build
   ```

3. **Run the application**
   ```sh
   ./gradlew run
   ```

## API Configuration

- Configure API endpoints and credentials in `gradle.properties` or as environment variables.
- Ensure your backend API is accessible for data storage and retrieval.

## Contributing

Contributions are welcome!  
Fork the repository, create a feature branch, and submit a pull request.

## License

This project is licensed under the MIT License.

## Contact

For support or questions, open an issue or contact [@alen217](https://github.com/alen217).

---
*VisitorApp: Smart, Secure, and Simple Visitor Management*
