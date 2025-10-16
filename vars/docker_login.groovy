def call(String user, String token){
    pipeline {
        agent any
        stages {
            stage('docker_login') { 
                steps {
                    sh 'docker login -u ${user} -p ${token}'
                }
            }
        }
    }
}
