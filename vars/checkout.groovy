import jenkins.checkoutStage.checkoutSrc
def call(body){
    node('jenkins-docker-slave'){
    stage("checkout"){
      checkout1()
    }
  }
}