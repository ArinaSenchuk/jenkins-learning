pipeline {
    agent any
        tools {
            jdk 11
            gradle:6.0.1
        }
    stages {
        stage('build') {
            steps {
                sh 'gradlew --version'
            }
        }
    }
}
