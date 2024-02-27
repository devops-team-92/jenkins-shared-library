package com.example

class newClass2 {

    def executeShell(String command){
        result = command.execute().text.trim()
    }
}