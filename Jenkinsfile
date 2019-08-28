pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''./gradlew clean
./gradlew build'''
      }
    }
    stage('test') {
      steps {
        sh './gradlew test'
      }
    }
    stage('deploy') {
      steps {
        sh '''echo \'deploy\'
kill -9 $(lsof -i:8080 -t)
java jar /var/jenkins_home/workspace/Center_master/build/libs/*.jar'''
      }
    }
  }
}