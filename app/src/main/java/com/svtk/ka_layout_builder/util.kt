package com.svtk.ka_layout_builder

import android.view.View
import android.widget.TextView
import org.jetbrains.anko.style

fun View.style(textSize: Float) {
    style {
        view: View ->

        when (view) {
            is TextView -> view.textSize = textSize
        }
    }
}
