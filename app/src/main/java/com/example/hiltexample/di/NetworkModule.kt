package com.example.hiltexample.di

import com.example.hiltexample.network.AuthInterceptor
import com.example.hiltexample.network.OtherInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit

@Module
@InstallIn(ActivityComponent::class )
object NetworkModule {

    @AuthInterceptorRetrofit
    @Provides //return edeceğimiz değeri veriyor
    fun provideAuthRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addInterceptor(AuthInterceptor())
            .build()
    }

    @OtherInterceptorRetrofit
    @Provides //return edeceğimiz değeri veriyor
    fun provideOtherRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addInterceptor(OtherInterceptor())
            .build()
    }

}