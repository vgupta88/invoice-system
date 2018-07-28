# Invoice System


This project is an OOPS architected module part of a technical assessment to calculate discounts for an invoice considering few business rules.

## Restructured using Object oriented approach
![GitHub Logo](/ClassDiagram.png)
Format: ![Alt Text](url)

## Requirement
  - JDK 1.8
  - Apache Maven 3.x
  - SonarQube

## Technologies
- Java 8
- JUnit

## Code & Tests Coverage
The project comes with JaCoCo plugin to use with Sonar integration that enables it to cover code as well as tests via a valid SonarQube installation. 

### Setting it up

#### Running tests
```sh
$ mvn clean test
```
#### Local Sonar Environment
```sh
$ mvn clean install sonar:sonar
```
#### External Sonar Environment
```sh
$ mvn clean install -Dsonar.host.url=<url>
```

## TODO 
- Change input method to commandline
- Improve coverage
- Validations
- Database support
