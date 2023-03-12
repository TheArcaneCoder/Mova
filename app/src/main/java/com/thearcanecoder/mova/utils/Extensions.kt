package com.thearcanecoder.mova.utils

import android.content.Context
import androidx.datastore.preferences.preferencesDataStore

val Context.dataStore by preferencesDataStore(name = AppConstants.DATA_STORE_NAME)