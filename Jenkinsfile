pipeline {
    agent any

    triggers {
        githubPush()
    }

    environment {
        APP_NAME = "ritik7806/lms-backend"
        IMAGE_NAME = "${APP_NAME}:latest"
    }

    stages {

        stage('Clone Repository') {
            steps {
                git branch: 'test',
                    url: 'https://github.com/Ritik-7806/Library-Management-System.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh """
                docker build -t ${IMAGE_NAME} .
                """
            }
        }

        stage('Push Image on DockerHub') {
            steps {
                sh """
                docker login
                docker push ${IMAGE_NAME}
                """
            }
        }

        stage('Restart Deployment') {
            steps {
                sh """
                kubectl rollout deployment lms-backend -n lms
                """
            }
        }

        stage('Check Pods') {
            steps {
                sh """
                kubectl get pods -n lms
                """
            }
        }

    }
}