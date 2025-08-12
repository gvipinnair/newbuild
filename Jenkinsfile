pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/gvipinnair/newbuild.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'javac Main.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java Main'
            }
        }
    }
}