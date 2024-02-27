import com.example.YourClass

// def call() {
//     def instance = new YourClass()
//     return instance.executeShellCommand("echo test")
// }

def call(String command) {
    def instance = new YourClass()
    def result = instance.executeShellCommand(command)
    return result
}