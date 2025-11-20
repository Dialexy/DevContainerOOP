#!/bin/bash

# Verify Java installation
if ! command -v java &> /dev/null; then
    echo "Java is not installed or not in PATH. Please install Java."
    echo "Current PATH: $PATH"
    exit 1
fi

# Verify Maven installation
if ! command -v mvn &> /dev/null; then
    echo "Maven is not installed or not in PATH. Please install Maven."
    echo "Current PATH: $PATH"
    exit 1
fi

# Set JAVA_HOME and update PATH
JAVA_BIN=$(readlink -f $(which java))
JAVA_HOME=$(dirname $(dirname "$JAVA_BIN"))

# Debugging output for JAVA_HOME and PATH
echo "Resolved JAVA_HOME: $JAVA_HOME"
if [ ! -d "$JAVA_HOME" ]; then
    echo "Invalid JAVA_HOME: $JAVA_HOME"
    exit 1
fi
export JAVA_HOME
export PATH=$JAVA_HOME/bin:$PATH

echo "JAVA_HOME is set to $JAVA_HOME"
echo "Current PATH: $PATH"

# Preload Maven dependencies if pom.xml exists
if [ -f "pom.xml" ]; then
    echo "Preloading Maven dependencies..."
    mvn dependency:go-offline
fi

# Print confirmation
echo "Environment is ready for Java development."

exec "$@"
