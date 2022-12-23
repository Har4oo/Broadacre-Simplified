# 💧🍅 HarvestManager - GreenhouseSolution2.0 💧🍅

### Web based solution for complex and easier monitoring over crops you have planted

Spring boot application API for personal scheduling over garden pots. After planting a seed you will be able to see it's growth stage, how often u should water it, what air conditions you have to use, soil type should be included etc.

Gathering the needed information will significantly improve caring after your favourite plant

### UI of homepage

![crop-integration.png](images%2Fcrop-integration.png)
You will have the ability to inspect, integrate, delete, update crops

### MySQL database structure 

![database-structure.PNG](images%2Fdatabase-structure.PNG)
Table "crops" is the main one. Controls or is controlled by other tables like "personal_observations" and "harvesting".

### Pattern of project structure creation :

* Entities -> Repository -> Service -> ServiceImplementation -> Controller

### Setting environment and setting needed properties

### `check out recommended application.properties file settings`
### `mvn clean install`

If everything is okay with both of these you will be able to execute **.jar** file in target **directory**

After execution the tables in already created **harvestmanager** database will be created identical to the entities

