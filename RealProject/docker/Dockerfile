FROM openjdk:17-jdk-slim-buster
##bu javani o`rnatish uchun
WORKDIR /opt/app
##bu file joyini o`zgartirib qo`yadi
ARG JAR_FILE=target/docker-0.0.1-SNAPSHOT.jar
##spring-boot-web.jar --> shuni o`rniga file nomini yozsak targetni ichida yozib yaratadi\
##shu fileni
COPY ${JAR_FILE} docker.jar
ENTRYPOINT ["java","-jar","docker.jar"]

