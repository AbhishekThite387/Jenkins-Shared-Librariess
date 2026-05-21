def call(String repoUrl, String branchName){

    sh """
        git clone -b ${branchName} ${repoUrl}
    """

}
