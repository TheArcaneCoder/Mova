package com.thearcanecoder.mova.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class SplashActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)

        splashScreen.setKeepOnScreenCondition { true }
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}