pipeline {
    agent any
        tools {
            jdk 'Java-11'
            gradle 'gradle-6.0.1'
        }
    stages {
        stage('build') {
            steps {
                sh 'gradlew --version'
            }
        }
    }
}
