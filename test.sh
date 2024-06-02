

JAVA_VERSION=$("java" -version 2>&1 | awk -F[\"\"] '/version/ {print $2}')

if [[ $JAVA_VERSION == 11* ]]; then
    mvn test
else
    echo "Warning: You are not using Java 11 (current version: $JAVA_VERSION). Do you want to continue? (y/n)"
    read user_input
    if [[ $user_input == "y" || $user_input == "Y" ]]; then
        mvn test
    else
        echo "Please use Java 11"
    fi
fi
