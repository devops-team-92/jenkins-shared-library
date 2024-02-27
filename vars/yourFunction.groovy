import com.example.YourClass

def call(String command) {
    def instance = new YourClass()
    def result = instance.executeShellCommand(command)
    return result
}