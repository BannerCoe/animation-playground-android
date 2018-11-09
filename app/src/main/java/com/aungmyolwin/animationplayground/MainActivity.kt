package com.aungmyolwin.animationplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aungmyolwin.animationplayground.animator.AnimatorActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_animator.setOnClickListener {
            startActivity(Intent(this, AnimatorActivity::class.java))
        }

    }


}
