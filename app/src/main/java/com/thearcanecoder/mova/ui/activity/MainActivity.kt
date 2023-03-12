package com.thearcanecoder.mova.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.thearcanecoder.mova.R
import com.thearcanecoder.mova.utils.AppConstants
import com.thearcanecoder.mova.utils.dataStore
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.log(Log.VERBOSE, "Set content view")
        lifecycleScope.launch {
            dataStore.data.first().let { preferences ->
                Timber.log(
                    Log.INFO,
                    preferences.contains(AppConstants.ONBOARDING_VIEWED).toString()
                )
            }
        }
    }
}