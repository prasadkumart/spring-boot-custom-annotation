FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD target/spring-boot-custom-annotations-0.1.0.jar spring-boot-custom-annotations-0.1.0.jar
ENTRYPOINT ["java","-jar","spring-boot-custom-annotations-0.1.0.jar"]