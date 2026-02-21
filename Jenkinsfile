pipeline {
    agent any

    triggers {
        githubPush()
    }

    environment {
        APP_NAME = "lms"
        IMAGE_NAME = "${APP_NAME}:latest"
    }

    stages {
        stage('Clone') {
            steps {
                git branch: 'deploy',
                    url: 'https://github.com/Ritik-7806/Library-Management-System.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${IMAGE_NAME}")
                }
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker-compose down || true'
                sh 'docker-compose up -d --build'
            }
        }
    }
}