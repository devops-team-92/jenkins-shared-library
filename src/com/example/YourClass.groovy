package com.example

class YourClass implements Serializable  {
    def sayHello() {
        return "Hello from YourClass!"
    }
    def executeShellCommand(String command) {
        return command.execute().text.trim()
    }
}
