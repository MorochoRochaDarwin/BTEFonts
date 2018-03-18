package com.engisoftware.dmtextview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_hello.setOnClickListener({
            Toast.makeText(this, edit_text.text.toString(), Toast.LENGTH_LONG).show()
        })
    }
}
