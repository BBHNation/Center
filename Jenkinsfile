pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''bash
echo \'hello\'
ls
pwd
bash echo $PATH
bash gradle clean'''
      }
    }
  }
}