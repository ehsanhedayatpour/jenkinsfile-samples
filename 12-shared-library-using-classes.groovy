jsl = library(
  identifier: 'jenkins-shared-library@1.0.4',
  retriever: modernSCM(
    [
      $class: 'GitSCMSource',
      remote: 'https://github.com/ehsanhedayatpour/jenkins-shared-library.git'
    ]
  )
)

def build = jsl.com.mycompany.jenkins.Build.new(this)

pipeline {
  agent any
  stages {

    stage('Init') {
      steps {
        script {
          build.setBuildDescription(
            title: "#${env.BUILD_NUMBER} build title.",
            description: 'build description.'
          )
        }
      }
    }

    stage('Build') {
      steps {
        script {
          echo 'Building...'
        }
      }
    }

    stage('Unit Test') {
      steps {
        script {
          echo 'Unit Testing...'
        }
      }
    }

    stage('Deploy') {
      steps {
        script {
          echo 'Deploying...'
        }
      }
    }

  }
}
