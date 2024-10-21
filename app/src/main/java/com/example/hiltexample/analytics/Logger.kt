package com.example.hiltexample.analytics

import android.content.Context
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class Logger @Inject constructor(
    @ApplicationContext appcontext: Context,
    @ActivityContext activityContext: Context
) {
    fun boo(){
        println("boo")
    }
}