# 🤖 Spring AI Enterprise Chatbot

An **Enterprise AI Chatbot** built using **Spring Boot** and **Spring AI**, supporting multiple Large Language Model (LLM) providers including **OpenAI**, **Anthropic Claude**, and **Ollama**.

The application provides a unified REST API to interact with different AI models, allowing developers to seamlessly switch between cloud-based and local LLMs without changing the business logic.

---

## 🚀 Features

- ✅ Built with Spring Boot 3.x
- ✅ Powered by Spring AI
- ✅ Support for OpenAI GPT models
- ✅ Support for Anthropic Claude models
- ✅ Support for Ollama (Local LLMs)
- ✅ Easy provider switching through configuration
- ✅ REST API-based chatbot
- ✅ Clean and scalable architecture
- ✅ Enterprise-ready backend design
- ✅ Maven project structure

---

## 🛠️ Tech Stack

| Technology | Version |
|------------|----------|
| Java | 21 |
| Spring Boot | 3.x |
| Spring AI | Latest |
| Maven | Latest |
| OpenAI API | Supported |
| Anthropic API | Supported |
| Ollama | Supported |
| REST API | Yes |

---

# 📁 Project Structure

```
spring-ai-enterprise-chatbot
│
├── src
│   ├── main
│   │   ├── java
│   │   │    └── com.example.chatbot
│   │   │          ├── controller
│   │   │          ├── service
│   │   │          ├── config
│   │   │          └── SpringAiApplication.java
│   │   │
│   │   └── resources
│   │         └── application.properties
│   │
│   └── test
│
├── pom.xml
└── README.md
```

---

# ⚙️ Prerequisites

Before running the project, ensure you have:

- Java 21+
- Maven 3.9+
- IntelliJ IDEA / VS Code / Eclipse
- Git
- Internet connection (for OpenAI & Anthropic)
- Ollama installed (optional for local models)

---

# 📥 Clone Repository

```bash
git clone https://github.com/your-username/spring-ai-enterprise-chatbot.git

cd spring-ai-enterprise-chatbot
```

---

# 🔑 Configuration

## OpenAI

```properties
spring.ai.openai.api-key=YOUR_OPENAI_API_KEY
```

---

## Anthropic

```properties
spring.ai.anthropic.api-key=YOUR_ANTHROPIC_API_KEY
```

---

## Ollama

Install Ollama

https://ollama.com

Run a model

```bash
ollama run llama3.2
```

Spring AI Configuration

```properties
spring.ai.ollama.base-url=http://localhost:11434
spring.ai.ollama.chat.model=llama3.2
```

---

# ▶️ Running the Application

Using Maven

```bash
mvn spring-boot:run
```

or

```bash
./mvnw spring-boot:run
```

---

# 📡 API Endpoints

## Chat with OpenAI

```
GET /api/openai/{message}
```

Example

```
GET /api/openai/Hello
```

---

## Chat with Anthropic

```
GET /api/anthropic/{message}
```

Example

```
GET /api/anthropic/Explain Spring AI
```

---

## Chat with Ollama

```
GET /api/ollama/{message}
```

Example

```
GET /api/ollama/What is Java?
```

---

# 🧪 Testing using Postman

Example Request

```
GET http://localhost:8080/api/ollama/Hello
```

Response

```json
Hello! How can I assist you today?
```

---

# 🔄 Supported AI Providers

| Provider | Status |
|----------|--------|
| OpenAI | ✅ |
| Anthropic Claude | ✅ |
| Ollama | ✅ |

---

# 🌟 Future Enhancements

- Conversation memory
- Chat history
- JWT Authentication
- Role-based Authorization
- Vector Database Integration
- RAG (Retrieval-Augmented Generation)
- Document Upload
- PDF Question Answering
- Streaming Responses
- Docker Support
- Kubernetes Deployment
- AWS Deployment
- Rate Limiting
- Prompt Templates
- Function Calling / Tool Calling
- Multi-Agent Support

---

# 📷 Screenshots

Add screenshots here.

Example:

```
screenshots/

home.png

postman.png

swagger.png
```

---

# 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a feature branch

```
git checkout -b feature/new-feature
```

3. Commit your changes

```
git commit -m "Added new feature"
```

4. Push to GitHub

```
git push origin feature/new-feature
```

5. Open a Pull Request

---

# ⭐ If you found this project helpful

Give this repository a ⭐ on GitHub.

---

# 👨‍💻 Author

**Chaithanya Kumar Reddy**

Java Backend Developer

LinkedIn: https://www.linkedin.com/in/chaitu6

GitHub: https://github.com/Chaitu6666

---

# 📄 License

This project is licensed under the MIT License.

```
MIT License

Copyright (c) 2026

Permission is hereby granted, free of charge,
to any person obtaining a copy...
```

---

## 💡 Why this project?

This project demonstrates how to build a modern enterprise chatbot using Spring AI while supporting multiple LLM providers through a unified architecture. It showcases backend development best practices with Spring Boot and highlights integration with both cloud-based AI services (OpenAI and Anthropic) and local AI models (Ollama), making it suitable for enterprise applications, learning, and production-ready AI integrations.
