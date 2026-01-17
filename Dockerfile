# Dockerfile

# Builder stage: build with Java 25
FROM maven:3.9.4-eclipse-temurin-21 AS builder
WORKDIR /workspace

COPY pom.xml ./
RUN mvn -B -f pom.xml -N dependency:go-offline

COPY src ./src
RUN mvn -B -DskipTests package

# Runtime stage: JRE 25
FROM eclipse-temurin:21-jre
WORKDIR /app

COPY --from=builder /workspace/target/*.jar app.jar

ENV PORT=8080
EXPOSE 8080
ENV JAVA_OPTS=""

# If PORT is set use -Dserver.port, otherwise let Spring use application.properties
ENTRYPOINT ["sh", "-c", "if [ -n \"$PORT\" ]; then exec java $JAVA_OPTS -Dserver.port=$PORT -jar /app/app.jar; else exec java $JAVA_OPTS -jar /app/app.jar; fi"]
