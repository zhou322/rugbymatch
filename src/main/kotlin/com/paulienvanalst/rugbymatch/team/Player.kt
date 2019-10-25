package com.paulienvanalst.rugbymatch.team

import java.util.*


data class Player(val position: Position, val backNumber: Int) {

    val isStarting: Boolean
        get() = backNumber <= 15
}
