pipeline {
    agent { docker { image 'gradle:6.0.1' } }
    stages {
        stage('build') {
            steps {
                sh 'gradlew --version'
            }
        }
    }
}
