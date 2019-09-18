# MySTCWallet

## Using Spring-Boot JPA MySQL

1. **You can clone it from github by running following command**

    $ git clone https://github.com/aalamri/MySTCWallet.git
  
2. **Import project into IDE**

    File -> Import -> Maven -> Existing Maven Projects -> Browse Project from cloned location
    
3. **Right click on project in the IDE and then Maven -> Update Projects**

4. **you need MySQL database in the system in order to make application running**

5. **Update database credential and other configuration into application.properties available in src/main/java/resources**

```
## MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/stc_wallet
spring.datasource.username=root
spring.datasource.password=

#`hibernate_sequence' doesn't exist

spring.jpa.hibernate.use-new-id-generator-mappings=false

# drop n create table, good for testing, comment this in production
spring.jpa.hibernate.ddl-auto=create
```


6. **Right click on Application.java file and run as Java Application
Once Sprint Boot Application will be started successfully then we
can call following Endpoints by using POSTMAN**

7. **To get list of customer call following endpoint with GET Request**

   http://localhost:8080/api/v1/customers
