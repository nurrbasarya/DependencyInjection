package com.example.hiltexample.di

 import com.example.hiltexample.analytics.AnalyticsService
 import com.example.hiltexample.analytics.AnalyticsServiceImpl
 import dagger.Binds
 import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class ) //dependencylkeri sadece activity sınıfında kullanıcam diye sınırladı
 abstract class AnalyticsModule{

     @Binds
     abstract fun bindAnalyticsService(analyticsServiceImpl: AnalyticsServiceImpl):AnalyticsService
 }