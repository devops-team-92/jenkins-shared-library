import com.example.YourClass

def call() {
    def instance = new YourClass()
    return instance.executeShellCommand("echo test")
}
