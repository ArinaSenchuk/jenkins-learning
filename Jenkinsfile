pipeline {
    agent {
        image 'openjdk11:slim'
    }
    stages {
        stage('build') {
            steps {
                sh './gradlew --info --stacktrace build'
            }
        }
    }
}
