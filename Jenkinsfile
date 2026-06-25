pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
    }

    environment {
        IMAGE_NAME = "prabhad/payment-service"
        IMAGE_TAG = "v1"
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'Dev',
                    url: 'https://github.com/prabha123-git/payment-service-springboot.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t $IMAGE_NAME:$IMAGE_TAG .'
            }
        }

        stage('Docker Push') {
            steps {
                sh 'docker push $IMAGE_NAME:$IMAGE_TAG'
            }
        }
    }
}