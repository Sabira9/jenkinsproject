FROM openjdk:11
EXPOSE 8088
ADD target/Springbootmvcjpa-0.0.1-SNAPSHOT.war Springbootmvcjpa-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/Springbootmvcjpa-0.0.1-SNAPSHOT.war" ]

