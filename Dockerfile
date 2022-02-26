FROM openjdk:11

COPY ["./target/report-0.0.1-SNAPSHOT.jar", "/usr/app/"]

CMD ["java", "-jar", "/usr/app/report-0.0.1-SNAPSHOT.jar"]

EXPOSE 8087