pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''sh
echo \'hello\'
ls
pwd
gradle clean'''
      }
    }
  }
}