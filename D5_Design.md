# Design ( *Deliverable-05* )

## 1. Description.
For students and staff, takeaway has always been a good way to solve a meal. Whether for locals or people from other countries, ‘E-kitchen’ can provide them with a good takeaway service. ‘E-kitchen’ supports the choice of different languages. After selecting the language, the user will register/log in and get information about nearby restaurants. The user can select a restaurant to view the menu and add the selected food to the cart. After the selection is completed, the user can check out the cart. Users can view historical records and select previous purchases to re-order. After the re-order, the food will be added to the cart, and the user can check out to complete the purchase. Unlike other software, ‘E-kitchen’ will have more detailed meal information and evaluation system, and users can easily view the order history.

## 2. Architecture.
  ## Architecture Diagram
  ![Architecture Diagram](./img/Architecture.png)
  For our architecture we decided to use a layered structure. We found this to be the best option due to it's simplicity and readability. The software can be brokenvdown into a 4 layers which we can work on seperately, this also helps with debugging and testing. This architecture allows us to build our software faster and make it more reliable product in a short period of time. Although the architecture provides alot of benefits, it might prove to be hard to scale due to inherit qualities of it's architecture. Overall, we belive this is the best structure for our app.
  
## 3. Class Diagram 
  ## UML
  ![refined UML](./img/d5_rfUML.png)

## 4. Sequence Diagram
  ![CreateProfile Sequence](./img/sequenceDiagram.png) 

## 5. Design Patterns 
Design Pattern 1: (Creational) Singleton - [link](https://github.com/CS386-ImpulseTracker/MobileApp/blob/stage_design/ImpulseApp/app/src/main/AndroidManifest.xml/) only one static instance
of the Userprofile class is allowed because of the private constructor 

![UserProfile](./img/UserProfile.png)

## 6. Design Principals
Single Responsibility: the PlanPurchase will only store the items which we plan to buy. [link](https://github.com/CS386-ImpulseTracker/MobileApp/blob/stage_design/ImpulseApp/app/src/main/java/com/example/impulseapp/PlanPurchase.java/)

Dependency Inversion Principle: The code follows this principle because the Server and Data handling do not depend on the clients to do anything. They simply process requests from the user devices and work on enqueuing the request.[link](https://github.com/CS386-ImpulseTracker/MobileApp/blob/stage_design/ImpulseApp/build.gradle/)
