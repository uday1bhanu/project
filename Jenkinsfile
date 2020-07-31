pipeline {
  agent { label 'mynode' }
  stages {
    stage('Source') {
      steps {
        git 'https://github.com/aparnagk76/project.git'
      }
    }
    stage('Compile') {
      tools {
        gradle 'gradle4'
      }
      steps {
        sh 'gradle clean compileJava'
      }
    }
    stage('Test') {
      tools {
        gradle 'gradle4'
      }
      steps {
        sh 'gradle test'
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