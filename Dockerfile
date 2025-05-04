FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests || exit 1

EXPOSE 8080

CMD ["java", "-jar", "target/*.jar"]
