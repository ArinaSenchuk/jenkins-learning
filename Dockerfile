FROM openjdk:8
EXPOSE 8080
ADD /build/libs/*.jar /app.jar
CMD ["java", "-jar","/app.jar"]
