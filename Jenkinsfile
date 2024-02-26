pipeline {
    agent any
    environment {
        PATH = "${env.PATH};C:\\Windows\\System32"
    }
    tools {
        maven 'Maven 3.9.0'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', credentialsId: 'moo0d', url: 'https://github.com/moo0d/FarToCel.git'
            }
        }
        stage('Build') {
            steps {
                bat '"C:\\Program Files\\JetBrains\\IntelliJ IDEA 2023.2\\plugins\\maven\\lib\\maven3\\bin\\mvn" clean install'
            }
        }
        stage('Test') {
            steps {
                bat '"C:\\Program Files\\JetBrains\\IntelliJ IDEA 2023.2\\plugins\\maven\\lib\\maven3\\bin\\mvn" test'
            }
            post {
                success {
                    junit '**/target/surefire-reports/Test-*.xml'
                    jacoco(execPattern: '**/target/jacoco.exec')
                }
                failure {
                    echo 'Build failed. Sending notification...'
                    // Add any failure handling actions here
                }
            }
        }
    }
}


