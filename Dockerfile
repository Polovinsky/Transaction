FROM java:8

WORKDIR ./Transaction

ENV PORT 4567

ADD build.gradle /Transaction/build.gradle
ADD gradlew /Transaction/gradlew
ADD gradle /Transaction/gradle
ADD src /Transaction/src

RUN ["./gradlew", "clean"]
RUN ["./gradlew", "fatJar"]

EXPOSE 4567
ENTRYPOINT ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "build/libs/Transaction-1.0-SNAPSHOT.jar"]