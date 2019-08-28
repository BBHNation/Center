pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''sh
echo \'hello\'
ls
pwd
echo $PATH
gradle clean'''
      }
    }
  }
}