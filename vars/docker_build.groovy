def call(String tag){
    stages {
        stage('docker_build') { 
            steps {
                sh 'docker build -t ${tag} .'
            }
        }
    }
}
