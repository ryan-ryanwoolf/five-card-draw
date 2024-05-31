#!/bin/bash
JAVA_VERSION=$("java" -version 2>&1 | awk -F[\"\"] '/version/ {print $2}')

if [[ $JAVA_VERSION == 11* ]]; then
    mvn clean package
else
    echo "Please make sure that you are using Java 11"
fi
