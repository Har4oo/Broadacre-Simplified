# 🌱🍅 HarvestManager - GreenhouseSolution2.0 🍅🌱

### What involves looking after plants and crops you have decided to care for at your place such as balcony, garden, backyard...
1. **☀️Sunlight☀️**: As mentioned earlier, different plants require different levels of sunlight. Some plants, such as succulents and cacti, require a lot of sunlight, while others, such as ferns, prefer shade. Make sure to research your plant's requirements and place it in a spot that receives the appropriate amount of sunlight.
2. **💦Water💦**: Overwatering or underwatering can be detrimental to plants. It's important to research your plant's watering requirements and adjust the frequency and amount of water accordingly. Generally, it's better to underwater than overwater, as overwatering can lead to root rot and other issues.
3. **🧱Soil🧱**: Different plants require different types of soil, and it's important to use the appropriate soil for your plant. For example, succulents require well-draining soil, while orchids prefer a mix of bark and moss.
4. **🍎Nutrients🍎** (an apple a day keeps the doctor away): Plants require three primary nutrients for healthy growth: nitrogen, phosphorus, and potassium. These can be found in fertilizers or compost. Make sure to follow the instructions on the fertilizer package and avoid over-fertilizing, which can be harmful to the plant.
5. **🌡Temperature🌡**: Some plants are more sensitive to temperature than others. For example, tropical plants thrive in warm, humid conditions, while other plants, such as succulents, prefer drier conditions. Make sure to research your plant's temperature requirements and adjust the environment accordingly.
6. **🪱Pest control🪱**: Pests can harm plants and even kill them if left unchecked. Keep an eye out for any signs of pests, such as yellowing leaves, small holes in the leaves, or sticky residue. Treat pests quickly using organic or chemical methods.
7. **✂Pruning✂**: Regular pruning can help promote healthy growth and prevent the plant from becoming overgrown. Make sure to research the proper pruning techniques for your plant and use clean, sharp tools to avoid damaging the plant.

### HarvestManager is web based solution for complex and easier monitoring over crops you have planted

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

1. Inspecting the whole crop information about it's sort, plant stage, soil quality, location, whether it's active, seedlings number and etc.
2. Page allowing you to focus on crop's harvests and personal observations
3. Photos added by URL (because of copyright reasons) paste for better idea of how plants or/and crops look like. Those photos are shown on cards and in their information page
4. Easy access to other pages such as locations, sorts, soils and so on via the navbar
5. HarvestManager allows you to:  
   * Manipulate every data possible
   * Tracking the soil quality from planting to harvesting
   * Giving the plant place information
   * Defining information after harvesting
   * Commenting about personal observation the user has noticed during the plant lifespan

### Full Dataflow Diagram
![full-data-diagram-flow.jpg](images%2Ffull-data-diagram-flow.jpg)

1. HarvestManager is a web application where the user has the full authority to manipulate
the whole data flow. User via the tools that Thymeleaf and Bootstrap provide can access
the data. 
2. Thymeleaf communicates with the ViewController allowing the user's data to be
agile. The view is contains all of these controllers and Thymeleaf, Bootstrap integration.
3. The business logic is fully controlled by the service and it's implementation by 
getting the model data from repository. Entities allow the whole database creation.

