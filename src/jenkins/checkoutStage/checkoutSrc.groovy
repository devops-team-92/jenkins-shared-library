package jenkins.checkoutStage
// def steps
// Utilities(steps) {this.steps = steps}
// class checkout {
//     def checkout1(arg){
//         steps.sh "echo checkout $arg"
//     }
// }


class checkoutSrc implements Serializable {
  def steps
  String name

  checkoutSrc(steps) {this.steps = steps}
  def sayName() {
    steps.sh "echo ${name}"
  }
}