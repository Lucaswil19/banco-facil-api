FROM eclipse-temurin:17-jre


WORKDIR /app

RUN groupadd --system app && useradd --system --gid app app

COPY --chown=app:app target/banco-facil-api-0.0.1-SNAPSHOT.jar app.jar

USER app

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
