package com.djmac.demoandroidkotlin.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelMainActivity : ViewModel() {

    var counter = MutableLiveData<Int>(0)

    var error = MutableLiveData<String?>()

    var incrementCounter = {
        error.value = null
        counter.value = counter.value?.plus(1)
    }

    var decrementCounter = {
        if (counter.value == 0) {
            error.value = "Counter can not be less than 0"
        } else {
            counter.value = counter.value?.minus(1)
        }

    }

}