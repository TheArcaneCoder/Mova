package com.thearcanecoder.mova.utils

import androidx.datastore.preferences.core.booleanPreferencesKey

object AppConstants {
    const val DATA_STORE_NAME = "mova_data_store"
    val ONBOARDING_VIEWED = booleanPreferencesKey("is_onboarding_viewed")
}