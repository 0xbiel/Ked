package com.gabrielpolastrini.ked.view

import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*


class MainView : View("Ked") {
    override val root = textarea() {
        style {
            fontSize = 30.px
            wrapText = true
            focusColor = Color.TRANSPARENT
            faintFocusColor = Color.TRANSPARENT
            border = null
            focusColor = Color.TRANSPARENT
            fontFamily = "monospace"
            fontWeight = FontWeight.BOLD
        }
    }
}