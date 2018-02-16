package com.jd.jd158.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jd.jd158.swoosh.R
import com.jd.jd158.swoosh.Utilities.EXTRA_LEAGUE
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BasicActivity() {

    var selectLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if (selectLeague != "") {
            val skillsActivity = Intent(this, SkillActivity::class.java)
            skillsActivity.putExtra(EXTRA_LEAGUE, selectLeague)
            startActivity(skillsActivity)
        } else {
            Toast.makeText(this, "Please select gender", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClick (view : View){
        womansBtn.isChecked = false
        coedBtn.isChecked = false
        selectLeague = "Mens"
    }

    fun onWomansClick (view : View){
        mensBtn.isChecked = false
        coedBtn.isChecked = false
        selectLeague = "Womans"
    }

    fun onCoedClick (view : View){
        womansBtn.isChecked = false
        mensBtn.isChecked = false
        selectLeague = "Co-Ed"
    }
}
