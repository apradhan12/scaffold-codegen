Project generated on : 2020-07-15T17:47:19.593-04:00[America/New_York]

## Getting Started

This document assumes you have maven available.

Everything in this repository was automatically generated from [src/main/resources/openapi.yaml](./src/main/resources/openapi.yaml) using openapi-generator.

To regenerate the code, run:
```bash
java -jar openapi-generator-cli.jar generate \
   -i src/main/resources/openapi.yaml \
   -g java-vertx-web \
   -o .
```

To build the project using maven, run:
```bash
mvn package && java -jar target/openapi-java-vertx-web-server-1.0.0-SNAPSHOT-fat.jar
```

If all builds successfully, the server should run on [http://localhost:8080/](http://localhost:8080/)
