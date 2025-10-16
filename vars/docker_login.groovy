def call(String user, String token){
    stages {
        stage('docker_login') { 
            steps {
                sh 'docker login -u ${user} -p ${token}'
            }
        }
    }
}
