def call(String tag){
    pipeline {
        agent any
        stages {
            stage('docker_build') { 
                steps {
                    sh 'docker build -t ${tag} .'
                }
            }
        }
    }
}
