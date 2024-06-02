#!/bin/bash

JAVA_VERSION=$("java" -version 2>&1 | awk -F[\"\"] '/version/ {print $2}')

if [[ $JAVA_VERSION == 11* ]]; then
    java -jar target/five-card-draw-1.0-SNAPSHOT.jar
else
    echo "Warning: You are not using Java 11 (current version: $JAVA_VERSION). Do you want to continue? (y/n)"
    read user_input
    if [[ $user_input == "y" || $user_input == "Y" ]]; then
        java -jar target/five-card-draw-1.0-SNAPSHOT.jar
    else
        echo "Please use Java 11"
    fi
fi
