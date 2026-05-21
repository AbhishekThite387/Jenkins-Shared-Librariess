def call(String imageName , String imagetag){
  sh """
  docker build -t ${imageName}:${imagetag}
  """
}
