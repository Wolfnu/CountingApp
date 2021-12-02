package com.example.helloworld //this is the package(collection of code) we made

//we are importing other packages.
import androidx.appcompat.app.AppCompatActivity //makes it compatible in different devices.
import android.os.Bundle //contains the methods to make our app.
import android.widget.Button // allows us to code the button.
import android.widget.TextView // allows us to code the text view.
import android.widget.Toast // this is reference to toast.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //this will be called in the beginning when the screen is created, comes from Bundle import.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // this is where our application displays something. This is what we see on the screen. 'R(res).layout.activity_main', we are displaying the screen stored in res/layout/activity_main.xml
        //code is inside our on create (this is like the main function that the IDE runs)

        // get reference to button
        val btn_click_me = findViewById(R.id.button) as Button
        val myTextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0
        // set on-click listener
        btn_click_me.setOnClickListener {
            timesClicked++
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        } // executes the code when the button is triggered.

    }
}