# Invoice System


This project is an OOPS architected module part of a technical assessment to calculate discounts for an invoice considering few business rules.

## Requirement
  - JDK 1.8
  - Apache Maven 3.x
  - SonarQube

## Technologies
- Java 8
- JUnit

## Code & Tests Coverage
The project comes with JaCoCo plugin to use with Sonar integration that enables it to cover code as well as tests via a valid SonarQube installation. 
Test coverage is broken currently. Fix in progress

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
- Improve coverage
- Validations
- Database support for user management (so we don't need to pass user object in request)
