The purpose of that project is to present Spring Cloud Contract Verifier (https://cloud.spring.io/spring-cloud-contract/)

# How to setup it

* Clone two repos from GitHub
```
git clone https://github.com/mmatecki/reporting-app.git
git clone https://github.com/mmatecki/warehouse-app.git
```

**Warehouse App** is the main application which return Products (id, name and quantity).

**Reporting App** is the second one which depends on _Warehouse App_ and returns the quantities for given ids

* Build Warehouse App and install generated stubs in local Maven repo
```
mvn clean install
```

* Build Reporting App and run it
```
mvn clean spring-boot:run -Drun.profiles=local
```

Now on port 10000 you should have registered stubs for Warehouse App and on port 8080 running Reporting App. Check a few endpoints:
 * http://localhost:8080/stubs
 * http://localhost:10000/product/1 
 * http://localhost:8080/report?productIds=1,2,3