package com.gabrielpolastrini.ked.app

import com.gabrielpolastrini.ked.view.MainView
import javafx.stage.Stage
import tornadofx.App

class MyApp: App(MainView::class) {
    override fun start(stage: Stage) {
        with(stage) {
            minWidth = 700.0
            minHeight = 700.0

            super.start(this)
        }
    }
}