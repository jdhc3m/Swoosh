package com.jd.jd158.swoosh.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jd.jd158.swoosh.Model.Player
import com.jd.jd158.swoosh.R
import com.jd.jd158.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var player = Player("", "")
        setContentView(R.layout.activity_finish)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        finishTxt.setText("Looking for a ${player.skill} for ${player.league} league near you...")



    }
}
