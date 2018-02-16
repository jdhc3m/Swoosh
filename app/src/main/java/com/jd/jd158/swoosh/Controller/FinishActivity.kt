package com.jd.jd158.swoosh.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jd.jd158.swoosh.R
import com.jd.jd158.swoosh.Utilities.EXTRA_LEAGUE
import com.jd.jd158.swoosh.Utilities.EXTRA_SKILLS
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_finish)

        val extraSkill = intent.getStringExtra(EXTRA_SKILLS)
        val extraLeague = intent.getStringExtra(EXTRA_LEAGUE)
        finishTxt.setText("Looking for a $extraSkill $extraLeague league near you...")



    }
}
