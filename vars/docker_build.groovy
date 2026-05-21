def call(string imageName , string imagetag){
  sh """
  docker build -t ${imageName}:${imagetag}
  """
}
