package com.example

class YourClass {
    def sayHello() {
        return "Hello from YourClass!"
    }
    def executeShellCommand(command) {
        def errorMsg = "Failed to execute the commands"
        try {
            if (isUnix()) {
                script.sh(script: command)
            } else{
                bat(script: command)
            }
        }
        catch (hudson.AbortException ex) {
            throw echo "test catch"
        }
    }
}
