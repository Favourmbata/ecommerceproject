FROM maven:3.8.7 as build
COPY . .
RUN mvn -B clean package -DskipTests

FROM openjdk:17-jdk-slim
COPY --from=build ./target/*.jar ecommerce.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","ecommerce.jar"]