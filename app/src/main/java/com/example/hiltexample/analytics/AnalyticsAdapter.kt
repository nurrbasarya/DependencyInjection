package com.example.hiltexample.analytics

import javax.inject.Inject

class AnalyticsAdapter @Inject constructor(
    val service: AnalyticsService
)