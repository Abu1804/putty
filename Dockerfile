FROM eclipse-temurin:17
COPY target/putty.jar putty.jar
CMD ["java","-jar","putty.jar"]