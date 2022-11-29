FROM azul/zulu-openjdk:11
RUN mkdir -p /software/app
COPY build/libs/*.jar /software/app/app.jar
ENTRYPOINT ["java", "-jar", "/software/app/app.jar"]