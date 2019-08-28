pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''bash
echo \'hello\'
ls
pwd
bash $PATH
bash gradle clean'''
      }
    }
  }
}