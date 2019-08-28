pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''bash
echo \'hello\'
ls
pwd
echo $PATH
gradle clean'''
      }
    }
  }
}