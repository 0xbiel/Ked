package com.gabrielpolastrini.ked.view

import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*


class MainView : View("Ked") {
    override val root = hbox {
        resize(600.0, 700.0)
        setPrefSize(600.0, 700.0)
        textarea() {
            style {
                minWidth = 600.px
                minHeight = 700.px
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
}