FROM openjdk:11
EXPOSE 9091
ADD build/libs/mon-domaine-metier-0.0.1-SNAPSHOT.jar mon-domaine-metier-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/mon-domaine-metier-0.0.1-SNAPSHOT.jar"]