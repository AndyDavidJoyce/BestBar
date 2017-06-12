package com.andy.bestbar.ui.base

/**
 * Created by andrewjoyce on 12/06/2017.
 */
interface Presenter<T : MvpView> {
    fun attachView(view : T)
    fun detachView()
}