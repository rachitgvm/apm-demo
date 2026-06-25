# Elastic APM Monitoring with Spring Boot

A real-time application monitoring project built using **Spring Boot**, **Elastic APM**, **Elasticsearch**, **Kibana**, and **Filebeat** to monitor application performance, capture logs, visualize metrics, and analyze application behavior.

---

## 📌 Project Overview

This project demonstrates how to monitor a Java Spring Boot application using the Elastic Stack.

The application generates application logs and APM traces whenever REST APIs are accessed. Filebeat collects the logs and sends them to Elasticsearch, while the Elastic APM Java Agent captures performance metrics and request traces. Kibana is then used to visualize logs, transactions, traces, and dashboards.

---

## 🏗️ Architecture

```
                    HTTP Request
                          │
                          ▼
                 Spring Boot Application
                 (/login, /warn, /make-error)
                     │              │
                     │              │
             Application Logs   APM Agent
                     │              │
                     ▼              ▼
                 Filebeat      APM Server
                     │              │
                     └──────┬───────┘
                            ▼
                     Elasticsearch
                            │
                            ▼
                         Kibana
          (Dashboards • Discover • APM • Visualizations)
```

---

# Technologies Used

- Java 23
- Spring Boot
- Maven
- Elastic APM Java Agent
- Filebeat 9.4.2
- Elasticsearch 9.4.2
- Kibana 9.4.2
- Windows

---

# Features

- Real-time application monitoring
- REST API performance tracking
- Distributed tracing
- Application log collection
- Error monitoring
- Transaction analysis
- Custom Kibana dashboards
- Log searching using Kibana Discover
- Elasticsearch indexing

---

# Project Structure

```
apm-demo
│
├── src
│   ├── main
│   │   ├── java
│   │   ├── resources
│   │
│   └── test
│
├── logs
│
├── pom.xml
│
└── README.md
```

---

# REST Endpoints

| Endpoint | Description |
|-----------|-------------|
| /login | Generates INFO log |
| /warn | Generates WARN log |
| /make-error | Generates ERROR log |

---

# Workflow

1. User sends an HTTP request.
2. Spring Boot processes the request.
3. Application logs are generated.
4. Elastic APM Agent records transaction details.
5. Filebeat reads log files.
6. Logs are shipped to Elasticsearch.
7. APM data is sent to Elasticsearch.
8. Kibana visualizes logs and application performance.

---

# Dashboards Created

- Total Logs
- Total Error Logs
- Top Users
- Log Levels
- Error Count
- Application Transactions
- APM Response Time
- Discover Log Explorer

---

# Running the Project

## 1. Start Elasticsearch

```powershell
cd C:\elasticsearch-9.4.2\bin

.\elasticsearch.bat
```

---

## 2. Start Kibana

```powershell
cd C:\kibana-9.4.2\bin

.\kibana.bat
```

---

## 3. Start Filebeat

```powershell
cd C:\filebeat-9.4.2

.\filebeat.exe -e
```

---

## 4. Run Spring Boot

```powershell
mvn spring-boot:run
```

or run

```
ApmDemoApplication.java
```

from your IDE.

---

## 5. Test APIs

```
GET /login

GET /warn

GET /make-error
```

Example:

```
http://localhost:8080/login

http://localhost:8080/warn

http://localhost:8080/make-error
```

---

# Kibana

The project uses Kibana for:

- Discover
- Lens
- Dashboards
- Dev Tools
- Elastic APM

---

# Screenshots

Add screenshots here:

- Spring Boot Running
- Elasticsearch Running
- Filebeat Running
- Kibana Discover
- APM Transactions
- Trace Waterfall
- Dashboard
- Error Logs
- Total Logs Metric

---

# Learning Outcomes

Through this project, I learned:

- Spring Boot logging
- Elastic Stack architecture
- Elastic APM monitoring
- Filebeat log shipping
- Elasticsearch indexing
- Kibana dashboard creation
- Log analysis
- Application performance monitoring
- Distributed tracing

---

# Future Improvements

- Docker deployment
- Kubernetes monitoring
- Alerting
- Email notifications
- Grafana integration
- Microservices monitoring
- CI/CD pipeline integration

---

# Author

**Rachit G V M**

Computer Science Engineering

GitHub:
https://github.com/rachitgvm

---

# License

This project is created for educational and learning purposes.
