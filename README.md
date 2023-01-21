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

1. **CRUD using the MVC model.**  
2. Hibernate/JPA creating Entities **[CROP, HARVEST, LOCATION, PERSONALOBSERVATION, PLANTSTAGE, SOIL, SORT]** in Database 
3. HTML pages for all of the entities (about to change) [edit, create and home page]
4. HTML and CSS for dropdowns, cards, navbar and etc.
5. Index/Home page presenting existing crops and their data
6. Navbar redirecting to every page possible
7. API and View data manipulation

### Full Dataflow Diagram
![HarvestManager-dataflow-diagram.jpg](images%2FHarvestManager-dataflow-diagram.jpg)

The client has the full authority to read, create, edit and delete data from the database.
HarvestManager is a single-user app. The user has the ability to request the index/home page
which displays the existing crops. Those crops are readable, editable, removable and creatable.
Crops depend on the sorts, plant stages, locations and soils which means crops are not possible
for creation if these tables are empty. Harvest and personal observations depend on crops.

