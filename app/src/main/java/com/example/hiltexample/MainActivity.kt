package com.example.hiltexample

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hiltexample.analytics.AnalyticsAdapter
import com.example.hiltexample.analytics.Logger
import com.example.hiltexample.di.AuthInterceptorRetrofit
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var logger: Logger

    @Inject
    lateinit var analyticsAdapter:AnalyticsAdapter

    @AuthInterceptorRetrofit
    @Inject
    lateinit var retrofit:Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        defaultActivityCodes()

        analyticsAdapter.service.analyticsMethods()
    }

    private fun defaultActivityCodes(){
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}