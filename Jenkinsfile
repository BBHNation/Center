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
cp /var/jenkins_home/workspace/Center_master/build/libs/*.jar /var/tmp'''
      }
    }
  }
}