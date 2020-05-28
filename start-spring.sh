#!/bin/sh

java -XX:+IgnoreUnrecognizedVMOptions -XX:+UseContainerSupport -XX:+IdleTuningCompactOnIdle -XX:+IdleTuningGcOnIdle -Xquickstart -Xshareclasses:cacheDir=/app/cache,readOnly -Dserver.port=8081 -classpath /app/application.jar:BOOT-INF/lib/* org.springframework.boot.loader.JarLauncher