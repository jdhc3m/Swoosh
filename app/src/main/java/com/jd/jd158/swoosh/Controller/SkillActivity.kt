package com.jd.jd158.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.jd.jd158.swoosh.R
import com.jd.jd158.swoosh.Utilities.EXTRA_LEAGUE
import com.jd.jd158.swoosh.Utilities.EXTRA_SKILLS
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var skills = ""
    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
    fun onBallerClicked(view : View){
        beginnerBtn.isChecked = false
        skills = "Balled"
    }

    fun onBeginnerClicked(view : View) {
        ballerBtn.isChecked = false
        skills = "Beginner"
    }

    fun onSkillFinishClicked(view : View){
       if (skills != "") {
           val finishScreen = Intent(this, FinishActivity::class.java)
           finishScreen.putExtra(EXTRA_SKILLS, skills)
           finishScreen.putExtra(EXTRA_LEAGUE, league)
           startActivity(finishScreen)
       } else {
           Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
       }
    }

}
