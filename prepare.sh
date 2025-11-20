#!/bin/bash

# Verify Java installation
if ! command -v java &> /dev/null; then
    echo "Java is not installed or not in PATH. Please install Java."
    exit 1
fi

# Verify Maven installation
if ! command -v mvn &> /dev/null; then
    echo "Maven is not installed or not in PATH. Please install Maven."
    exit 1
fi

# Set JAVA_HOME and update PATH
export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which java))))
export PATH=$JAVA_HOME/bin:$PATH
echo "JAVA_HOME is set to $JAVA_HOME"

# Preload Maven dependencies if pom.xml exists
if [ -f "pom.xml" ]; then
    echo "Preloading Maven dependencies..."
    mvn dependency:go-offline
fi

# Print confirmation
echo "Environment is ready for Java development."

exec "$@"
