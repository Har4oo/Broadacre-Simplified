# 💧🍅 HarvestManager - GreenhouseSolution2.0 💧🍅

### Web based solution for complex and easier monitoring over crops you have planted

Spring boot application API for personal scheduling over garden pots. After planting a seed you will be able to see it's growth stage, how often u should water it, what air conditions you have to use, soil type should be included etc.

Gathering the needed information will significantly improve caring after your favourite plant

### Used Technologies and DEV Environment 
* Java
* Spring Boot
* MySQL | MySQL Workbench
* Thymeleaf
* Bootstrap
* Postman
* IntelliJ IDEA [Community Edition]
* Git | GitHub | GitHub Projects 

### UI of homepage idea

![crop-integration.png](images%2Fcrop-integration.png)
You will have the ability to inspect, integrate, delete, update crops

### MySQL database structure 

![database-structure.png](images%2Fdatabase-structure.png)  
Table "crops" is the main one. Controls or is controlled by other tables like "personal_observations" and "harvesting".

### Pattern of project structure creation :

* Entities -> Repository -> Service -> ServiceImplementation -> Controller

### Setting environment and setting needed properties

### `check out recommended application.properties file settings`
### `mvn clean install`

If everything is okay with both of these you will be able to execute **.jar** file in **target directory**

After execution the tables in already created **harvestmanager** database will be structured identical to the entities

### List of all functionalities

1. Cards showing the crops' photo and description about it's characteristics provided from the database 
2. Navigation bar having the ability to redirect the user to other app pages
3. Reading, creating, editing and deleting data every table via the pages
4. Dropdown menus allowing the user to choose from data possible that communicates between tables

### Full Dataflow Diagram
![full-data-diagram-flow.jpg](images%2Ffull-data-diagram-flow.jpg)

1. HarvestManager is a web application where the user has the full authority to manipulate
the whole data flow. User via the tools that Thymeleaf and Bootstrap provide can access
the data. 
2. Thymeleaf communicates with the ViewController allowing the user's data to be
agile. The view is contains all of these controllers and Thymeleaf, Bootstrap integration.
3. The business logic is fully controlled by the service and it's implementation by 
getting the model data from repository. Entities allow the whole database creation.

