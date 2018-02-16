package com.jd.jd158.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.jd.jd158.swoosh.Model.Player
import com.jd.jd158.swoosh.R
import com.jd.jd158.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var skills = ""
    var player = Player("", "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }
    
    fun onBallerClicked(view : View){
        beginnerBtn.isChecked = false
        player.skill = "Balled"
    }

    fun onBeginnerClicked(view : View) {
        ballerBtn.isChecked = false
        player.skill = "Beginner"
    }

    fun onSkillFinishClicked(view : View){
       if (player.skill != "") {
           val finishScreen = Intent(this, FinishActivity::class.java)
           finishScreen.putExtra(EXTRA_PLAYER, player)
           startActivity(finishScreen)
       } else {
           Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
       }
    }

}
