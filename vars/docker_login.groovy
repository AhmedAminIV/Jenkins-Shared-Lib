def call(String user, String token){
    echo "Logging in to Docker Hub..."
    sh """
       docker login -u ${user} -p ${token}
    """
}
