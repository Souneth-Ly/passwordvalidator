**Build and use service**
1. cd into passwordvalidator
2. mvn clean install
3. include the following in the client's pom:
```
<dependency>
    <groupId>passwordvalidator</groupId>
    <artifactId>password-validator</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

****Project Description****

This project will validate input passwords by follow three rules
1. Must be between 5 and 12 characters in length.
2. Must consist of a mixture of lowercase letters and numerical digits only, with at least one of each.
3. Must not contain any sequence of characters immediately followed by the same sequence.

The service will returns true for valid passwords and false for invalid passwords.

This project built using Maven.
Time take to complete 8 hours.