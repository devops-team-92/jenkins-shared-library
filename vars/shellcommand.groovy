import com.example.newClass2


def call(String command) {
    def output = new newClass2()
    output = output.executeShell(command)
    return output
}