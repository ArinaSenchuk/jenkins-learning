pipeline {
    agent {
        image 'adoptopenjdk/openjdk11:slim'
    }
    stages {
        stage('build') {
            steps {
                sh './gradlew --info --stacktrace build'
            }
        }
    }
}
