FROM adoptopenjdk/openjdk11-openj9:jre

COPY target/lib /app/BOOT-INF/lib
WORKDIR /app

#These steps pre-populate a shared classes cache, which improves startup time and reduces memory consumption, they can be removed if needed
COPY target/custom-serverless-function.jar /app/custom-serverless-function.jar
RUN /bin/sh -c 'java -XX:+IgnoreUnrecognizedVMOptions -XX:+UseContainerSupport -XX:+IdleTuningCompactOnIdle -XX:+IdleTuningGcOnIdle -Xquickstart -Xshareclasses:cacheDir=/app/cache -classpath /app/custom-serverless-function.jar:BOOT-INF/lib/* org.springframework.boot.loader.JarLauncher &' ; sleep 10
RUN rm /app/custom-serverless-function.jar
#End of performance optimizations

ADD script.sh /app/
ADD start-spring.sh /app/
ADD proxy /app/

ENV PROXY_PORT 8081
ENV PROXY_ALIVE_DELAY 4000
ENV APP_SERVER_CMD /app/start-spring.sh
EXPOSE 8080

CMD ./script.sh