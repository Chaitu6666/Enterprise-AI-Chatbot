# 🤖 Ollama AI Chat Application

A modern Spring Boot web application that integrates with **Ollama** for local AI-powered conversations. This application provides a beautiful, interactive chat interface to communicate with AI models running locally.

## ✨ Features

- **Local AI Integration** - Uses Ollama for on-device AI processing
- **Beautiful UI** - Modern, responsive chat interface with gradient design
- **Real-time Chat** - Instant message processing and responses
- **Error Handling** - Graceful error management with user feedback
- **Mobile Responsive** - Works seamlessly on desktop and mobile devices
- **Spring Boot** - Built with Spring Boot 3.5.16 and Spring AI

## 🛠️ Tech Stack

- **Backend**: Spring Boot 3.5.16, Spring AI, Java 17
- **Frontend**: HTML5, CSS3, JavaScript
- **AI**: Ollama (Local LLM Runtime)
- **Build Tool**: Maven

## 📋 Prerequisites

Before running this application, ensure you have:

1. **Java 17 or higher** - [Download JDK](https://adoptium.net/)
2. **Maven 3.9+** - [Download Maven](https://maven.apache.org/)
3. **Ollama** - [Download Ollama](https://ollama.ai/)

### Setting up Ollama

1. Download and install Ollama from https://ollama.ai/
2. Run a model (e.g., `ollama run llama2` or `ollama run neural-chat`)
3. Ollama will run on `localhost:11434` by default

## 🚀 Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/ollama-ai-chat.git
cd ollama-ai-chat/Ollama
```

### 2. Build the Project
```bash
mvn clean install
```

### 3. Run the Application
```bash
mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8081"
```

Or using Maven Wrapper:
```bash
./mvnw spring-boot:run -Dspring-boot.run.arguments="--server.port=8081"
```

### 4. Access the Application
Open your browser and navigate to:
```
http://localhost:8081
```

## 📖 Usage

1. **Start typing** your message in the chat input box
2. **Press Enter** to send the message (or Shift+Enter for a new line)
3. **Wait** for the AI response (shown with a loading animation)
4. **Continue** the conversation

### Example Queries
- "What is the capital of France?"
- "Explain quantum computing in simple terms"
- "Write a Python function to calculate factorial"
- "What are the benefits of machine learning?"

## 🔌 API Endpoints

### Chat Endpoint
```
GET /api/ollama/{message}
```

**Parameters:**
- `message` (string, URL-encoded) - The user's message

**Response:**
- Returns the AI-generated response as plain text

**Example:**
```
GET /api/ollama/Hello%20world
```

## 🏗️ Project Structure

```
ollama-ai-chat/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/AI/Ollama/
│   │   │       ├── OllamaApplication.java
│   │   │       └── Controller/
│   │   │           └── OllamaController.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── index.html (Chat UI)
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── OllamaApplicationTests.java
├── pom.xml
├── mvnw / mvnw.cmd
└── README.md
```

## ⚙️ Configuration

The application uses default Spring Boot configuration. To customize settings, edit `src/main/resources/application.properties`:

```properties
server.port=8081
spring.application.name=Ollama
```

## 🐛 Troubleshooting

### "Connection failed" Error
- Ensure Ollama is running: `ollama serve` (or it runs automatically after installation)
- Check that Ollama is accessible at `localhost:11434`

### Port Already in Use
- Change the port: `--server.port=8082`
- Or kill the process using the port

### Build Failures
- Ensure Java 17+ is installed: `java -version`
- Clear Maven cache: `mvn clean`
- Run: `mvn dependency:resolve`

## 📦 Build with Maven

```bash
# Clean and build
mvn clean install

# Run tests
mvn test

# Package as JAR
mvn package

# Run the JAR
java -jar target/Ollama-0.0.1-SNAPSHOT.jar
```

## 🔄 Development

### Running in Development Mode
```bash
mvn spring-boot:run
```

### Live Reload (requires Spring Boot DevTools)
DevTools is not currently configured but can be added to `pom.xml` for automatic restart on file changes.

## 📝 Dependencies

Key dependencies (managed by Spring Boot 3.5.16):
- **spring-boot-starter-web**: REST API support
- **spring-ai-starter-model-ollama**: Ollama integration
- **spring-boot-starter-test**: Testing framework

## 🤝 Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues for bugs and feature requests.

## 📄 License

This project is open source and available under the MIT License.

## 🔗 Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring AI Documentation](https://spring.io/projects/spring-ai)
- [Ollama Documentation](https://ollama.ai/)
- [Maven Documentation](https://maven.apache.org/)

## 💬 Support

For issues, questions, or suggestions, please open an issue on GitHub.

---

**Happy Chatting with AI! 🚀**
