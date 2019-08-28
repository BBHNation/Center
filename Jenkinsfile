pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''bash
echo \'hello\'
ls
pwd
$PATH
bash gradle clean'''
      }
    }
  }
}