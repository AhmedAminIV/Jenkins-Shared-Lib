def call(String image){
    stages {
        stage('docker_push') { 
            steps {
                sh 'docker push ${image}'
            }
        }
    }
}
