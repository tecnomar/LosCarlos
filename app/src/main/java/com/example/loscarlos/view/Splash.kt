package com.example.loscarlos.view

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.loscarlos.R
import com.example.loscarlos.databinding.SplashScreenBinding

class Splash : AppCompatActivity() {
    private lateinit var binding: SplashScreenBinding
    private lateinit var viewPager: ViewPager
    private lateinit var anim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.animationView.setAnimation(R.raw.pescado)
        binding.animationView.playAnimation()
        viewPager = binding.pager
        anim = AnimationUtils.loadAnimation(this, R.anim.o_b_anim)
        viewPager.setAnimation(anim)

        val pagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter
    }

    override fun onResume() {
        super.onResume()
        ObjectAnimator.ofFloat(binding.fondoCurvo, "translationY", -2400f).apply {
            duration = 2000
            startDelay = 4000
            start()
        }

        ObjectAnimator.ofFloat(binding.logo, "translationY", 1800f).apply {
            duration = 2000
            startDelay = 4000
            start()
        }

        ObjectAnimator.ofFloat(binding.nombre, "translationY", 1800f).apply {
            duration = 2000
            startDelay = 4000
            start()
        }

        ObjectAnimator.ofFloat(binding.animationView, "translationY", 1800f).apply {
            duration = 2000
            startDelay = 4000
            start()
        }

        object : CountDownTimer(4000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                binding.animationView.repeatCount = ValueAnimator.INFINITE
            }

            override fun onFinish() {
                binding.animationView.cancelAnimation()
            }
        }.start()
    }

    private inner class ScreenSlidePagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
        override fun getCount(): Int = 3


        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> Fragment1()
                1 -> Fragment2()
                else -> Fragment3()
            }
        }
    }
}