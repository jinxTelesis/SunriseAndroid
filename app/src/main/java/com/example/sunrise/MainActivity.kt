package com.example.sunrise

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val controller = Controller()
        controller.start()
        val rssController:RSSController = RSSController()
        rssController.start()


    }
}
