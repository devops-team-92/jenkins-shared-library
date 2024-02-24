import jenkins.checkoutStage.*
def call(body){
    node('jenkins-docker-slave'){
    stage("checkout"){
      checkout1()
    }
  }
}
