FROM azul/zulu-openjdk:11
RUN mkdir -p /software/app
ADD build/libs/*.jar /software/app/app.jar
ENV PORT=8080
CMD java -jar /software/app/app.jar