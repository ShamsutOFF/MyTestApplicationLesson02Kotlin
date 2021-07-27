package com.example.mytestapplicationlesson02kotlin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object Model {

    var importantString: String? = null
        set(value) {
            field = value
            _importantLiveData.value = field
        }

    private val _importantLiveData = MutableLiveData<String>()
        val importantLiveData : LiveData < String >
        get() = _importantLiveData
}
