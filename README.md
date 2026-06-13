# Real-Time Chat Application

A simple real-time chat application built using Spring Boot and WebSockets. This project demonstrates bidirectional communication between clients and the server using STOMP over WebSocket with SockJS fallback support.

## Technologies Used

* Spring Boot
* Thymeleaf
* WebSocket
* STOMP
* SockJS
* Bootstrap

## Features

* Real-time messaging
* Multiple users can communicate simultaneously
* WebSocket-based bidirectional communication
* STOMP messaging protocol support
* SockJS fallback for browser compatibility
* Simple and responsive user interface

## How It Works

1. Users enter their name and message.
2. The client establishes a WebSocket connection with the server.
3. Messages are sent to the server using STOMP.
4. The server broadcasts messages to all connected clients.
5. Messages appear instantly without page refresh.

## Running the Application

1. Clone the repository.

```bash
git clone <repository-url>
```

2. Navigate to the project directory.

```bash
cd <project-name>
```

3. Run the application.

```bash
mvn spring-boot:run
```

4. Open your browser and visit:

```text
http://localhost:8080
```

## Learning Objectives

This project was created to understand:

* WebSocket communication in Spring Boot
* STOMP messaging protocol
* SockJS integration
* Real-time client-server communication
* Thymeleaf-based frontend rendering

## Author

Roma Shirodkar
