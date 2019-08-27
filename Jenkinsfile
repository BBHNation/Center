pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''echo \'hello world\'
gradle clean
gradle build'''
      }
    }
  }
}