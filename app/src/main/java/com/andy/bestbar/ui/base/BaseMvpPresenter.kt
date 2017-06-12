package com.andy.bestbar.ui.base

/**
 * Created by andrewjoyce on 12/06/2017.
 */
open class BaseMvpPresenter<T : MvpView> : Presenter<T> {

    private var mvpView: T? = null
    val view: T
        get() { return mvpView?: throw NullPointerException() }

    override fun attachView(view: T) {
        mvpView = view
    }

    override fun detachView() {
        mvpView = null
    }

    fun isViewAttached() : Boolean {
        return mvpView != null
    }
}