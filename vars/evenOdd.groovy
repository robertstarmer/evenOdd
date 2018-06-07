// vars/evenOrOdd.groovy
def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage('Even Stage') {
          steps {
            echo "The build number is even"
            script { 
              log.info 'Starting even build'
              log.warning 'Nothing to do!'
            }
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage('Odd Stage') {
          steps {
            echo "The build number is odd"
            script { 
              log.info 'Starting odd build'
              log.warning 'Nothing to do!'
            }
          }
        }
      }
    }
  }
}
