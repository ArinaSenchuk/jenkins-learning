FROM openjdk:11
EXPOSE 8080
CMD ["gradlew build"]
ADD /build/libs/*.jar /app.jar
CMD ["java", "-jar","/app.jar"]
