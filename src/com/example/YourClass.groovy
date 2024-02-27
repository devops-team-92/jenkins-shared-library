package com.example

class YourClass {
    def sayHello() {
        return "Hello from YourClass!"
    }
    def executeShellCommand(command) {
        def errorMsg = "Failed to execute the commands"
        try {
                sh(script: command)
        }
        catch (Exception e) {
            return "An error occurred: ${e.message}"
        }
    }
}
