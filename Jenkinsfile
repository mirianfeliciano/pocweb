pipeline {
    agent any
    stages {
        stage ('Checkout source') {
            steps {
                checkout scm
            }
        }

        stage ('Test Front') {
            steps {
                bat '''
                    gradlew clean test --info
                '''
            }
        }
    }
}