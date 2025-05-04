FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests || (echo '❌ Build failed' && ls -la target && exit 1)

EXPOSE 8080

CMD ["java", "-jar", "target/split-payment-0.0.1-SNAPSHOT.jar"]

