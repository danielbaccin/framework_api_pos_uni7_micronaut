<h2>Projeto desenvolvido para experimentos com Micronaut</h2>

Esse projeto, será utilizado no meu TCC da Pos Graduação em Eng. de Software na UNI7.

## Using Gradle

To run the application locally use:

```
./gradlew run -t
```

The `-t` flag enables automatical reload.

To build an executable JAR file run:

```
./gradlew assemble
java -jar build/libs/application-0.1-all.jar
```

To build a native image (requires JDK 8 version of GraalVM) run:

```
./gradlew nativeImage
./build/native-image/application