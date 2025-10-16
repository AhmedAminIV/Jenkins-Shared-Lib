def call(String image) {
    echo "Pushing Docker image: ${image}"
    sh """
      docker push ${image}
    """
}
