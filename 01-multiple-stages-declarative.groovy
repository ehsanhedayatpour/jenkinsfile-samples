pipeline {
  agent any
  stages {

    stage('Build') {
      steps {
        script {
          echo 'Stage-1'
        }
      }
    }

    stage('Deploy') {
      steps {
        script {
          echo 'Stage-2'
        }
      }
    }
  }
}
