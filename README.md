
# MedSecure: Blockchain-Powered Cloud Security for Healthcare Data

## 🏥 Project Overview
MedSecure is a **blockchain-powered cloud security enhancement** designed for **secure and privacy-preserving personal health record (PHR) sharing**. This system ensures **data integrity, decentralized security, and controlled access management** for patients, healthcare providers, and third parties. Leveraging **blockchain smart contracts, encryption, and cloud computing**, MedSecure prevents unauthorized modifications and ensures seamless data exchange.

## 🔐 Why MedSecure?
- **Immutability & Security:** Blockchain ensures tamper-proof and verifiable records.
- **Privacy-Preserving Data Sharing:** Patients control access via **smart contracts**.
- **Cloud Integration:** Secure **cloud storage** with blockchain verification.
- **Transparency & Auditability:** Every access event is logged on-chain.
- **Scalability & Performance:** Optimized for handling large medical datasets.

## 🛠️ Key Features
- **Blockchain-Backed PHR Management** with **secure hashing**
- **Timed Smart Contracts** for controlled data access
- **Role-Based Access Control (RBAC)** for Patients, Doctors, and Admins
- **AES & SHA-256 Encryption** for data confidentiality
- **Cloud Storage Security Enhancement** for scalability
- **Audit Trail & Log Monitoring** for compliance verification

## 🧑‍⚖️ Compliance & Standards
MedSecure aligns with major **healthcare and cloud security regulations**:
- **HIPAA (Health Insurance Portability and Accountability Act)** – Ensures protection of patient health data.
- **GDPR (General Data Protection Regulation)** – Enables patient consent and data control.
- **ISO 27001** – International standard for secure **cloud computing and data management**.
- **NIST Cybersecurity Framework** – Best practices for securing cloud-based healthcare data.
- **FHIR (Fast Healthcare Interoperability Resources)** – Ensures **interoperability of PHRs** across healthcare systems.

## 🧑‍💻 Tech Stack
- **Backend:** Java (JSP, Servlets)
- **Blockchain:** Custom Blockchain Implementation
- **Database:** MySQL
- **Encryption:** AES-256, SHA-256
- **Cloud:** AWS / Google Cloud Integration
- **UI:** HTML, CSS, JavaScript, Bootstrap
- **Libraries:** Apache POI, MySQL Connector
- **Server:** GlassFish

## 🏗️ Project Structure
```
BlockChainMedicalCare/
│
├── src/java/                # Blockchain logic, DB connection, Servlets
├── DB/                      # SQL setup script
├── web/                     # UI assets (JSP, CSS, JS, Images)
├── build/web/               # Deployment-ready JSP files
├── lib/                     # External JAR dependencies
└── nbproject/               # NetBeans project setup files
```

## 🚀 Getting Started
### Prerequisites
- Java JDK
- NetBeans IDE
- GlassFish Server
- MySQL Database

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/MedSecure.git
   ```
2. Import the project into NetBeans.
3. Execute `block_chain_medical.sql` from the `DB` folder to set up the database.
4. Update `DB.java` with your database credentials.
5. Deploy the project to GlassFish.
6. Access the application: `http://localhost:8080/BlockChainMedicalCare/`

## 👥 User Roles
### Patient
- View medical history
- Schedule appointments
- Manage access control for PHRs

### Doctor
- Access patient records
- Issue prescriptions
- Approve appointments

### Admin/Receptionist
- Manage appointments
- Update patient records

## 🖼️ Screenshots
![Dashboard](screenshots/dashboard.png)
![Appointments](screenshots/appointment.png)
