pipeline {
    agent any
    
    
    stages {
        stage('Clone repository') {
            steps {
                container('jnlp') {
                    dir('service') {
                        git url: repoUrl
                    }
                }
            }
        }
    }
}