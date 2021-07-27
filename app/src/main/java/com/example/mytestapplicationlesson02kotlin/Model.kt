package com.example.mytestapplicationlesson02kotlin;

public class Model {
    private var importantString: String = ""

    fun setValue(value: String) {
        importantString = value
    }

    fun getValue ():String{
        return importantString
    }
}
