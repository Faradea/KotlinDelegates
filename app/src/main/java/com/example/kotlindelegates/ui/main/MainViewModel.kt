package com.example.kotlindelegates.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var loginOut: String by TrimDelegate()

    private val _loginOutLiveData = MutableLiveData<String>()
    val loginOutLiveData: LiveData<String> = _loginOutLiveData

    fun setInputLogin(login: String) {
        loginOut = login
        _loginOutLiveData.postValue(loginOut)
    }
}