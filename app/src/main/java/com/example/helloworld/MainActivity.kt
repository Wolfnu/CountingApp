package com.example.helloworld //this is the package(collection of code) we made

//we are importing other packages.
import androidx.appcompat.app.AppCompatActivity //makes it compatible in different devices.
import android.os.Bundle //contains the methods to make our app.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //this will be called in the beginning when the screen is created, comes from Bundle import.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // this is where our application displays something. This is what we see on the screen. 'R(res).layout.activity_main', we are displaying the screen stored in res/layout/activity_main.xml
    }
}