package com.yunuseker.kotlfylib

import android.view.View

fun View.hide(gone: Boolean = true) {
    visibility = if (gone) View.GONE else View.INVISIBLE
}

fun View.show() {
    visibility = View.VISIBLE
}

fun View.toggle() {
    if (this.visibility == View.VISIBLE)
        this.visibility = View.GONE
    else
        this.visibility = View.VISIBLE
}

fun View.showWithAlpha() {
    this.animate().alpha(1F).start()
}

fun View.hideWithAlpha() {
    this.animate().alpha(0F).start()
}