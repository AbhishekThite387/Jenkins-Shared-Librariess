def call(String imageName, String imageTag, String dockerHubUser){

    withCredentials([usernamePassword(
        credentialsId:"dockerHub",
        passwordVariable:"dockerHubPass",
        usernameVariable:"dockerHubUsername"
    )]){

        sh "docker tag ${imageName}:${imageTag} ${dockerHubUser}/${imageName}:${imageTag}"

        sh """
        echo ${env.dockerHubPass} | docker login -u ${env.dockerHubUsername} --password-stdin
        """

        sh "docker push ${dockerHubUser}/${imageName}:${imageTag}"
    }
}
