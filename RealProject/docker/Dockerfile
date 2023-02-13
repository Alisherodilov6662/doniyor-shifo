FROM openjdk:17-jdk-slim-buster
##bu javani o`rnatish uchun
WORKDIR /opt/app
##bu file joyini o`zgartirib qo`yadi
ARG JAR_FILE=target/mazgi.jar
##spring-boot-web.jar --> shuni o`rniga file nomini yozsak targetni ichida yozib yaratadi(yuqoridagi dcker fileni qayerda ekanligini ko`rsatin qo`ydik)
##shu fileni
COPY ${JAR_FILE} docker.jar
ENTRYPOINT ["java","-jar","docker.jar"]

#//just for commit