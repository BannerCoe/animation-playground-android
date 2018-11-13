package com.aungmyolwin.animationplayground.animator

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.os.Bundle
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.view.animation.OvershootInterpolator
import androidx.appcompat.app.AppCompatActivity
import com.aungmyolwin.animationplayground.R
import kotlinx.android.synthetic.main.activity_animator.*

class AnimatorActivity : AppCompatActivity() {
    //That was introduce in api 11

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animator)

        //ObjectAnimator
        //general purpose,properly
        ObjectAnimator.ofFloat(tv_title, View.ALPHA, 0f, 1f).apply {
            duration = 1300
            interpolator = DecelerateInterpolator()
            repeatMode = ObjectAnimator.REVERSE
            repeatCount = ObjectAnimator.INFINITE
        }.start()


        //PropertyValueHolder
        //multiple properties on the same object
        val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, 0.5f, 1f)
        val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.5f, 1f)
        val alpha = PropertyValuesHolder.ofFloat(View.ALPHA, 0f, 1f)
        //u can inflate property value animator form xml
        //TODO inflate from xml
        ObjectAnimator.ofPropertyValuesHolder(tv_failed, scaleX, scaleY, alpha).apply {
            duration = 2000
            interpolator = OvershootInterpolator()
        }.start()


        //ViewPropertyAnimator
        //Fire-n-Forget
        //No  animation coordination
        //no reverse// repeat // seeking
        fab_android.animate()
                .scaleX(1.5f).scaleY(1.5f).alpha(1f)
                .setDuration(600)
                .setInterpolator(OvershootInterpolator())
                .start()

        //TODO:animator set
        //choreograph a set of animations
        //coming soon


        //TODO:ValueAnimator
        //coming soon
    }
}
