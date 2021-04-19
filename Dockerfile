FROM maven:3-openjdk-8
COPY src /prog/src
COPY pom.xml /prog/
WORKDIR /prog
RUN mvn clean package && cp /prog/target/prog.jar / && rm -r /prog
WORKDIR /
ENTRYPOINT ["java", "-jar", "/prog.jar"]