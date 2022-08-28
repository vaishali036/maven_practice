From openjdk:11

COPY target/locationweb8-0.0.1-SNAPSHOT.war /
WORKDIR /
CMD ["java", "-jar", "locationweb8-0.0.1-SNAPSHOT.war"]
