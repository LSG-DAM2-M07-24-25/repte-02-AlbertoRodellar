package com.example.repte2_albertorodellar.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class Repte2ViewModel() : ViewModel() {
    var character: String by mutableStateOf("")

    var characterName: String by mutableStateOf("")


}