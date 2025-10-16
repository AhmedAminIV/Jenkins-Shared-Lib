def call(String image){
    pipeline {
        agent any
        stages {
            stage('docker_push') { 
                steps {
                    sh 'docker push ${image}'
                }
            }
        }
    }
}
