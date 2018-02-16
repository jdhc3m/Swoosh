package com.jd.jd158.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.jd.jd158.swoosh.Model.Player
import com.jd.jd158.swoosh.R
import com.jd.jd158.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BasicActivity() {

    var player = Player("", "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
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

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillsActivity = Intent(this, SkillActivity::class.java)
            skillsActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillsActivity)
        } else {
            Toast.makeText(this, "Please select gender", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClick (view : View){
        womansBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = "Mens"
    }

    fun onWomansClick (view : View){
        mensBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = "Womans"
    }

    fun onCoedClick (view : View){
        womansBtn.isChecked = false
        mensBtn.isChecked = false
        player.league = "Co-Ed"
    }
}
