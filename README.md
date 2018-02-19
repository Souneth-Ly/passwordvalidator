**Build and use service**
1. cd into passwordvalidator
2. mvn clean install
3. include the following in the client's pom:

<dependency>
    <groupId>passwordvalidator</groupId>
    <artifactId>password-validator</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>