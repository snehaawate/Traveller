package com.unipi.torpiles.cyprustraveler.utils

import Constants.EL
import Constants.EN
import Constants.ENGLISH_LANG
import Constants.GREEK_LANG
import Constants.LANGUAGE
import android.app.Application
import android.content.Context
import com.orhanobut.hawk.Hawk
import com.unipi.torpiles.cyprustraveler.ui.activities.BaseActivity
import java.util.*

class SetLanguage : Application() {

    override fun onCreate() {
        super.onCreate()
        init()
    }

    private fun init() {
        setupLanguage(baseContext)
    }

     fun setupLanguage(context: Context) {
         Hawk.init(context).build()
         val language : String = Hawk.get(LANGUAGE)
         //Log.e("LANGUAGE CLASS", language)
         when (language) {
            GREEK_LANG ->    BaseActivity.defaultLocale = Locale(EL)
            ENGLISH_LANG ->  BaseActivity.defaultLocale = Locale(EN)
        }
    }
}
