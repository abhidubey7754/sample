FROM openjdk:17
MAINTAINER abhi
WORKDIR /user/app
COPY target/sample_docker.jar sample_docker.jar
ENTRYPOINT ["java","-jar","sample_docker.jar"]