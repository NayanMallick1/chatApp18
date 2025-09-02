# chatApp18
# Spring Boot WebSocket Chat Application

A real-time chat application built with **Spring Boot**, **STOMP over WebSockets**, and **SockJS**.  
This project demonstrates how to build a simple messaging system with a publish/subscribe model.

---

## Features
- Real-time bidirectional messaging using WebSockets
- STOMP protocol with SockJS fallback
- Timestamped messages
- Spring Security with CSRF disabled for WebSocket endpoints
- Frontend using plain HTML + JavaScript
- Simple broker `/topic/messages` for broadcasting

---

## Project Structure
- ChatAppApplication.java # Main Spring Boot app
- ChatController.java # Handles incoming messages
- ChatMessage.java # Message model
- SecurityConfig.java # Allows WebSocket endpoints
- WebSocketConfig.java # STOMP/WebSocket configuration

## Directory Reference
- **Backend Code:** [src/main/java/com/example/chatapp](src/main/java/com/example/chatapp)
- **Static Resources:** [src/main/resources/static](src/main/resources/static)
- **Configuration:** [src/main/resources/application.properties](src/main/resources/application.properties)

---
# Maven dependencies pom.xml

## Getting Started

### Prerequisites
- Java 17 or later
- Maven 3.6+
- (Optional) VS Code / IntelliJ IDEA

### Installation
```bash
# Clone the repository
git clone https://github.com/NayanMallick1/chatApp18.git

# Navigate to project
cd chatApp

# Build and run
mvn spring-boot:run
```
---
## How to Use

1. Open [http://localhost:8080/index.html](http://localhost:8080/index.html) in your browser.  
2. Enter your name and start chatting.  
3. Messages are broadcast to all connected clients in real time.  

---

## WebSocket Endpoints

- **STOMP endpoint:** `/chat` (with SockJS fallback)  
- **Publish messages to:** `/app/send`  
- **Subscribe for messages:** `/topic/messages`  

---

## Deployment

- Update SockJS URL in `index.html` if hosting externally:  

```javascript
const socket = new SockJS('https://<your-domain>/chat');
```
---
### 1. Spring Boot Application Startup (Terminal)
Shows the chat application starting successfully using Spring Boot, initializing WebSocket endpoints, and running on port 8080.  
<img width="1440" height="900" alt="Spring Boot Startup" src="https://github.com/user-attachments/assets/6c444518-efc9-434f-8033-6a3d8288e1a5" />

---
### 2. Ngrok Tunnel Running
Demonstrates how the application is exposed to the internet using ngrok, with active HTTP/WebSocket requests being logged in real-time.  
<img width="657" height="429" alt="image" src="https://github.com/user-attachments/assets/b9950fd2-8c85-4f48-a045-6460d3b00cd7" />

---
### 3. Final Chat Application UI
The deployed real-time private chat interface, showing live WebSocket messaging between users.  
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/8d79975a-917d-4bbc-b6d1-adaae6fd2ca7" />

