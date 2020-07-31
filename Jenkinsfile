pipeline {
  agent { label 'mynode' }
  stages {
    stage('Checkout code') {
        steps {
            checkout scm
        }
    }
    stage('Compile') {
      steps {
        sh './gradlew clean build'
      }
    }
    stage('Test') {
      steps {
        sh './gradlew test'
      }
    }
    stage('Package') {
        steps {
            sh 'echo package'
        }
    }
    stage('Deploy') {
        steps {
            sh 'echo deploy'
        }
    }
  }
}
