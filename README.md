# Adapter Pattern - Media Player Example

This project demonstrates the **Adapter Design Pattern** in Java using a Media Player example.
The Adapter pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate by converting the interface of one class (the adaptee) into another interface expected by the client (the target).

## Project Structure
- **MediaPlayer (Interface)** – Defines the play method.  
- **AudioPlayer** – Implements `MediaPlayer`, supports playing MP3 files.  
- **LegacyVideoPlayer** – A separate class that plays MP4 files, but does not implement `MediaPlayer`.  
- **VideoPlayerAdapter** – Implements `MediaPlayer` and adapts `VideoPlayer` so it can be used as a `MediaPlayer`.  
- **AdapterPatternDemo** – Main class to test the functionality.

## Design Principles
- **Adapter Pattern** – Bridges incompatible interfaces (`VideoPlayer` to `MediaPlayer`).  
- **Polymorphism** – `AudioPlayer` and `VideoPlayerAdapter` both implement `MediaPlayer`.  
- **Encapsulation** – Keeps implementation details hidden while exposing a common interface.  

## Prerequisites
To build and test this project, you will need:
- Java Development Kit (JDK 11 or newer)  
- Apache Maven  

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repository-name.git
2. Navigate to the project directory:
   ```bash
      cd your-repository-name

## Verification Commands
 Run the following commands from the project root.

Compile Code
mvn clean compile

Run Tests
mvn test








<img width="395" height="283" alt="image" src="https://github.com/user-attachments/assets/4b8d6a43-ab6b-402c-b20f-35cb069ab47a" />
