FROM openjdk:17-jdk-slim-buster
WORKDIR /app
COPY /out/artifacts/pep_pro_help_jar/pep_pro_help.jar /app/pep_pro_help.jar
ENTRYPOINT ["java","-jar","pep_pro_help.jar"]