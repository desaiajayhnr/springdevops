FROM openjdk:8
ADD  /var/lib/jenkins/workspace/springdevops_master/target/springdevops-0.0.1-SNAPSHOT.jar springdevops.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "springdevops.jar"]
