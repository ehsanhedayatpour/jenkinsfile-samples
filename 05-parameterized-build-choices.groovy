pipeline {
  agent any

  parameters {
    choice(
      description: '',
      name: 'environment',
      choices: ['PRE', 'PRO']
    )
  }

  stages {
    stage("Wat") {
      steps {
        echo "selectedEnvironment: ${params.environment}"
      }
    }
  }
}
