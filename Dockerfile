FROM openjdk:11-jre-slim
WORKDIR /usr/src/app
COPY entrypoint.sh /usr/src/app/entrypoint.sh
COPY build/libs/*.jar /usr/src/app/app.jar
RUN chmod 755 /usr/src/app/entrypoint.sh
ENTRYPOINT ["/usr/src/app/entrypoint.sh"]
#CMD ["sh", "-c", "export $(cat /run/secrets/secrets.env | xargs)", "java -jar /app.jar"]