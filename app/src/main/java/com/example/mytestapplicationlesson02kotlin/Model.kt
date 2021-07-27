package com.example.mytestapplicationlesson02kotlin

class Model {
    var subscriber: ((string: String?) -> Unit)? = null
    private var importantString: String? = null

    fun setValue(value: String?) {
        importantString = value
        subscriber?.invoke(value)
    }

    fun getValue(): String? {
        return importantString
    }
}
