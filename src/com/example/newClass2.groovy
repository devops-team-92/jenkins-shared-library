package com.example

class newClass2 {

    def executeShell(String command){
        def result = command.execute().text.trim()
        return result
    }
}