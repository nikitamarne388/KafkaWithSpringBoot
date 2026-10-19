# Apache Kafka with Spring Boot

A hands-on learning project demonstrating how to integrate **Apache Kafka with Spring Boot** by implementing separate Producer and Consumer applications.

This project explores asynchronous messaging, Kafka topics, partitions, and producer-consumer communication using Java and the Spring ecosystem.

## 📌 Project Overview

The goal of this project is to understand the fundamentals of Apache Kafka and learn how to build event-driven applications using Spring Boot.

The project contains two applications:

- **Producer:** Publishes messages to Kafka topics.
- **Consumer:** Subscribes to Kafka topics and consumes messages published by the producer.

Apache Kafka acts as the messaging platform that enables communication between the two applications without requiring them to communicate directly.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 17 | Programming language |
| Spring Boot 4 | Application framework |
| Spring for Apache Kafka | Integration between Spring Boot and Kafka |
| Apache Kafka | Distributed event-streaming and messaging platform |
| Apache ZooKeeper | Kafka coordination service in the ZooKeeper-based setup |
| Maven | Dependency management and build automation |
| Git & GitHub | Version control and project hosting |
| IntelliJ IDEA | Development environment |

*Note: The versions and configuration of Kafka, ZooKeeper, and Spring for Apache Kafka should match those used in your local setup.*

## 📂 Project Structure

```text
KafkaWithSpringBoot/
│
├── Producer/
│   └── Spring Boot Producer application
│
├── Consumer/
│   └── Spring Boot Consumer application
│
└── README.md
```

Each application has its own source code and configuration. The exact internal package structure can be explored inside the respective folders.

## ✨ Concepts and Features Practiced

### 1. Kafka Producer

The Producer application demonstrates how to publish messages to Kafka topics using Spring Boot and Spring for Apache Kafka.

Key concepts:
- Configuring a Kafka producer.
- Connecting a Spring Boot application to a Kafka broker.
- Publishing messages to Kafka topics.
- Understanding the producer's role in asynchronous messaging.

### 2. Kafka Consumer

The Consumer application demonstrates how to subscribe to Kafka topics and process messages published by the Producer.

Key concepts:
- Configuring a Kafka consumer.
- Consuming messages from Kafka topics.
- Understanding consumer groups and message consumption.
- Processing messages asynchronously.

### 3. Kafka Topics

Topics provide logical categories in which Kafka stores and organizes messages.

In this project, I practiced creating and configuring Kafka topics and using them for communication between the Producer and Consumer applications.

### 4. Kafka Partitions

Partitions divide a topic into multiple ordered logs, allowing Kafka to distribute data and support parallel processing.

I practiced creating topics with partitions and exploring how partitions relate to message consumption and consumer scalability.

### 5. Producer-Consumer Communication

The project demonstrates the messaging flow between two Spring Boot applications:

```text
Producer Application
        |
        | Publishes a message
        v
   Apache Kafka
        |
        v
    Kafka Topic
        |
        | Message available for consumption
        v
Consumer Application
        |
        v
   Message Processing
```

This architecture helps separate message producers from consumers and reduces direct dependencies between applications.

## ⚙️ Prerequisites

Before running the applications, ensure you have:

- Java Development Kit (JDK) 17.
- Apache Kafka configured for your environment.
- Apache ZooKeeper, if required by your Kafka version and configuration.
- Maven, or a Maven wrapper included in the project.
- IntelliJ IDEA or another Java IDE.

**Important:** ZooKeeper is used by older ZooKeeper-based Kafka deployments. Newer Kafka deployments can use KRaft mode instead. Follow the configuration that matches your installed Kafka version.

## 🚀 Getting Started

### Step 1: Clone the repository

```bash
git clone https://github.com/nikitamarne388/KafkaWithSpringBoot.git
```

Navigate to the project directory:

```bash
cd KafkaWithSpringBoot
```

### Step 2: Start Kafka infrastructure

Start ZooKeeper and Kafka using the scripts and configuration files appropriate for your Kafka installation.

For a traditional ZooKeeper-based Kafka installation, the commands on Linux or macOS commonly resemble:

Start ZooKeeper:

```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
```

Start Kafka in another terminal:

```bash
bin/kafka-server-start.sh config/server.properties
```

On Windows, use the corresponding `.bat` scripts from your Kafka installation's `bin\windows` directory, if provided by your Kafka distribution.

Make sure the broker address configured in the Spring Boot applications matches your Kafka setup. A common local development address is:

```text
localhost:9092
```

### Step 3: Create a Kafka topic

Use the topic name configured in your Producer and Consumer applications.

For a traditional ZooKeeper-based Kafka installation, a topic can be created with a command similar to:

```bash
bin/kafka-topics.sh --create \
  --topic my-topic \
  --bootstrap-server localhost:9092 \
  --partitions 3 \
  --replication-factor 1
```

Replace `my-topic` with your configured topic name.

The example creates a topic with three partitions and a replication factor of one. Adjust these values to match your local setup.

On Windows, use the corresponding `.bat` scripts and Windows command syntax.

### Step 4: Run the Producer application

1. Open the `Producer` folder in IntelliJ IDEA.
2. Load the Maven project.
3. Verify the Kafka broker and topic configuration.
4. Run the Spring Boot application.
5. Publish a message using the producer implementation provided in the project.

### Step 5: Run the Consumer application

1. Open the `Consumer` folder in IntelliJ IDEA.
2. Load the Maven project.
3. Verify the Kafka broker, topic, and consumer group configuration.
4. Run the Spring Boot application.
5. Observe the application logs to verify message consumption.

### Step 6: Verify Producer-Consumer communication

Publish a message using the Producer application and check the Consumer application's logs.

If the configuration is correct, the Consumer should receive and process messages published to the topic it subscribes to.

*The exact startup commands and message-publishing steps depend on the application's configuration and implementation.*

## 📚 Key Learnings

Through this project, I am learning and practicing:

- Integrating Apache Kafka with Spring Boot.
- Implementing separate Producer and Consumer applications.
- Configuring Kafka connections in Spring Boot.
- Creating Kafka topics.
- Understanding topic partitions.
- Publishing and consuming messages.
- Exploring asynchronous communication between applications.
- Understanding the role of ZooKeeper in ZooKeeper-based Kafka deployments.
- Building a foundation for event-driven architecture and distributed systems.

## 🎯 Future Improvements

Potential enhancements as I continue learning:

- Implement JSON message serialization and deserialization.
- Explore consumer groups with multiple consumers.
- Experiment with message keys and partition assignment.
- Learn about consumer offsets and delivery semantics.
- Implement error handling and retry mechanisms.
- Explore dead-letter topics.
- Add automated tests for producer and consumer components.
- Containerize the applications and Kafka infrastructure using Docker.

## 👩‍💻 Author

**Nikita Parkhande**

---

This repository is part of my hands-on learning journey in Java, Spring Boot, Apache Kafka, and event-driven application development.
