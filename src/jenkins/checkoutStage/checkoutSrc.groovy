package jenkins.checkoutStage
def steps
Utilities(steps) {this.steps = steps}
class checkout {
    def checkout1(arg){
        steps.sh "echo checkout $arg"
    }
}