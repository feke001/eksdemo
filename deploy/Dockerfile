#DOCKERFILE
FROM amazonlinux:2

RUN yum -y install java-11-amazon-corretto-headless

WORKDIR /usr/src/app
COPY eksdemo-0.0.1-SNAPSHOT.jar ./

ENTRYPOINT ["java", "-jar", "eksdemo-0.0.1-SNAPSHOT.jar"]
