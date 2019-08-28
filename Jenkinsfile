pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh './gradlew clean'
      }
    }
    stage('test') {
      steps {
        sh './gradle test'
      }
    }
  }
}