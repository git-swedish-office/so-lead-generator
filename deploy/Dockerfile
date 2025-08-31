FROM --platform=linux/amd64 openjdk:17
LABEL org.opencontainers.image.authors="admin@swedishoffice.com"
COPY artifacts/so-lead-generator.jar so-lead-generator.jar
ENTRYPOINT ["java","-jar","so-lead-generator.jar"]