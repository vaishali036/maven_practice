From openjdk:11

COPY target/locationweb8-0.0.1-SNAPSHOT.jar /
WORKDIR /
CMD ["java", "-jar", "locationweb8-0.0.1-SNAPSHOT.jar"]
