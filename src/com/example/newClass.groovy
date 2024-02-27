package com.example

class newClass {
    def executeCommand(String command){
    return command.execute().text.trim()
    }
}