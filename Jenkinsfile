pipeline {
  agent { label 'master' }
  stages {
    stage('Source') {
      steps {
        git 'https://github.com/aparnagk76/project.git'
      }
    }
    stage('Compile') {
      steps {
        sh './gradlew clean compileJava'
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
