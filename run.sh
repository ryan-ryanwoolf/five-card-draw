#!/bin/bash
JAVA_VERSION=$("java" -version 2>&1 | awk -F[\"\"] '/version/ {print $2}')

if [[ $JAVA_VERSION == 11* ]]; then
    java -jar target/five-card-draw-1.0-SNAPSHOT.jar
else
    echo "Please make sure that you are using Java 11"
fi
