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
                sh '''
                    ./gradlew clean test --info
                '''
            }
        }
    }