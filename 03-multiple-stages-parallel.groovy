pipeline {
  agent any
  stages {
    stage('Parallel stages') {
      parallel {

        stage('Build-1') {
          steps {
            script {
              sh 'sleep 20'
            }
          }
        }

        stage('Build-2') {
          steps {
            script {
              sh 'sleep 20'
            }
          }
        }
      }
    }
  }
}
