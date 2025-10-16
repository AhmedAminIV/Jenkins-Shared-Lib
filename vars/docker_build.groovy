def call(String tag){
   echo "Building Docker image: ${tag}"
    sh """
      docker build -t ${tag} .
    """
}
