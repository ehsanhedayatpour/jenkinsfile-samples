pipeline {
  agent any
  stages {
    stage('Parallel stages') {
      parallel {

        stage('Sequential Nested Stages') {
          stages {
            stage('Build-1') {
              steps {
                script {
                  echo 'Stage-1'
                  sh 'sleep 20'
                }
              }
            }
            stage('Build-2') {
              steps {
                script {
                  echo 'Stage-2'
                  sh 'sleep 20'
                }
              }
            }
          }
        }

        stage('Build-3') {
          steps {
            script {
              echo 'Stage-3'
              sh 'sleep 20'
            }
          }
        }
      }
    }
  }
}
