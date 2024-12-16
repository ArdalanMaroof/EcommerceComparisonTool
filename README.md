# E-commerce Product Comparison Tool

# Section 1: Project Description
1.1 Project
Project Name: E-commerce Product Comparison Tool

1.2 Description
The E-commerce Product Comparison Tool allows users to compare products from different e-commerce platforms (e.g.  ASOS, Real Time Product Search) based on features, prices, and reviews. This tool helps users make informed purchasing decisions by providing a clear, side-by-side comparison of multiple products from various online marketplaces. It excludes features like user registration, direct purchasing, and real-time pricing updates.

# Section 2: Overview
2.1 Purpose
The E-commerce Product Comparison Tool is a web-based application designed to help users search for and compare products from multiple e-commerce platforms. Users can view product details, add products to their wishlist, and manage their wishlist effectively. This tool simplifies decision-making by providing a centralized interface for product comparison and wishlist management.

2.2 Scope
The tool will include:

- Product search with filtering capabilities.
- A comparison interface for multiple products.
- Aggregated user reviews from different platforms.
- Price alerts and wishlist features.

Excluded Features:

- User Registration/Login.
- Direct product purchasing.
- Real-time price updates.

2.3 Requirements

2.3.1 Functional Requirements

- R1: The system shall allow users to search for products by name or category from different e-commerce APIs (e.g., ASOS and Real-Time Product Search).
- R2: The system shall allow users to filter products by price range, rating, and other categories.
- R3: The system shall allow users to compare multiple products by their features, prices, and reviews side-by-side.
- R4: The system shall allow users to set price alerts for specific products.
- R5: The system shall allow users to save products to a wishlist, add, view, and delete items from the wishlist..

2.3.2 Non-Functional Requirements

- Performance: The system shall return search results within few seconds.
- Reliability: The system shall have 99% uptime.
- Scalability: The system shall support up to big number (ideally) product comparisons per day without performance degradation.

2.3.3 Technical Requirements

- Hardware: The system will run on a cloud server with at least 4GB of RAM and 2 CPUs.
- Software: The backend will be developed using javascript, Node.js(Express.js).
- Database: MongoDB will be used to store product data, reviews, and comparison history.

2.3.4 Security Requirements

-Authentication: No user authentication will be required.
- Data Encryption: All sensitive data, such as user preferences and alerts, will be encrypted.



2.3.6 Traceability Matrix

SRS Requirement    	SDD Module
R1	                Product Search API 
R2	                Product Filter API 
R3	                Product Comparison Interface 
R4	                Wishlist Feature 

2.3.7 Technology Stack
-Frontend: HTML, CSS, JavaScrip
-Backend: Node.js(Express.js)
-APIs: Integrated with mock endpoints for ASOS and Real-Time Product Search
-Database: MongoDB for wishlist persistence

# Section 3: System Architecture
3.1 Overview
The system architecture consists of a backend API built using Node.js and a frontend interface for displaying the comparison results. The backend will interact with a MongoDB database to store product data, reviews, and user alerts. The system will be designed to fetch product data from external e-commerce APIs and present it to users in a unified manner.

3.2 Architectural Diagrams

- Component Diagram: Illustrates the major components of the system (frontend, backend, database, external e-commerce APIs).
- Sequence Diagram: Describes the interactions between the user, backend API, and external e-commerce APIs.
- Data Flow Diagram (DFD): Represents the flow of data between components.


  +------------------+       +------------------+       +---------------------+
|     Frontend     | <---> |    Backend API   | <---> |   External APIs     |
|  (Web/Mobile UI) |       |   (REST/GraphQL) |       | (Payment, Shipping, |
|                  |       |                  |       |   Third-party APIs) |
+------------------+       +------------------+       +---------------------+
        |                           |
        |                           |
        v                           v
+------------------+       +----------------------+
|    Database      | <----> |  Business Logic      |
|  (Products,      |       |  (Order Validation,  |
|  Users, Orders)  |       |   Inventory Check)   |
+------------------+       +----------------------+



# Section 4: Data Dictionary

Table         	Field	        Notes	                        Type
Products	     ProductID	   Unique product identifier	    DECIMAL
               Name	         Product name	VARCHAR
               Price        	Price of the product	DECIMAL
              Rating	       Average product rating	FLOAT
              Reviews	       Reviews from various platforms	TEXT
              
              
            
# Section 5: Data Design
  
   5.1 Persistent/Static Data
  
  The logical data model will include:

- Product Table: Stores product details.
- Review Table: Stores aggregated reviews from different platforms.
- Alert Table: Stores user-set price alerts for specific products.



Entities:

- Product: Attributes: ProductID (PK), Name, Price, Rating, Features.
- Review: Attributes: ReviewID (PK), ProductID (FK), UserReview, Rating.
- Alert: Attributes: AlertID (PK), ProductID (FK), ThresholdPrice.


# Section 6: User Interface Design

6.1 User Interface Design Overview

- Homepage: A search bar, filtering options, and product display area.
- Comparison Page: Displays selected products side-by-side, showing their features, prices, and reviews.

6.2 User Interface Navigation Flow
1. Homepage → Product Search
2. Search Results → Product Comparison
3. Product Comparison → Wishlist/Price Alerts

   
