package com.example

class YourClass {
    def sayHello() {
        return "Hello from YourClass!"
    }
    def executeShellCommand(String command) {
        return command.execute().text.trim()
    }
}
