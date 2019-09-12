#!/bin/bash

work_dir=`dirname $0`
cd "$work_dir"
echo " Working Directory: $work_dir "

case "$1" in
  "format")
    echo "googleJavaFormat"
    ./gradlew goJF
    ;;
  "clean")
    echo "./gradlew clean"
    ./gradlew clean
    ;;
  "ci")
    echo "googleJavaFormat"
    echo "./gradlew clean build"
    ./gradlew goJF
    ./gradlew clean build
    exit 0
    ;;
esac
