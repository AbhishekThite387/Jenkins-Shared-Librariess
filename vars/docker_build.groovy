def call(String imageName , String imagetag){
  sh """
  cd LondheShubham153-django-notes-app
  docker build -t ${imageName}:${imagetag} .
  """
}
