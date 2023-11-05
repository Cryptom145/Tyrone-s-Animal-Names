package com.tarona.animal.midterm.models

import java.io.Serializable

data class Animal (
    val name: String,
    val description: String,
    val status: Boolean

) : Serializable