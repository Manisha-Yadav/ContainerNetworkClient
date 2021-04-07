FROM mcr.microsoft.com/java/jre:11-zulu-alpine
WORKDIR /
ADD ./target/ContainerNetworkClient-1.0-SNAPSHOT.jar ContainerNetworkClient-1.0-SNAPSHOT.jar
EXPOSE 8080
CMD java -jar ContainerNetworkClient-1.0-SNAPSHOT.jar
