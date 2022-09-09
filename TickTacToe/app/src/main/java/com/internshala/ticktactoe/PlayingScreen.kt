package com.internshala.ticktactoe


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast


class PlayingScreen : AppCompatActivity() {
    var img11: ImageButton? = null
    var img12: ImageButton? = null
    var img13: ImageButton? = null
    var img21: ImageButton? = null
    var img22: ImageButton? = null
    var img23: ImageButton? = null
    var img31: ImageButton? = null
    var img32: ImageButton? = null
    var img33: ImageButton? = null

    var player1_name: TextView? = null
    var player2_name: TextView? = null
    var player1_score: TextView? = null
    var player2_score: TextView? = null

    var check11: String? = null
    var check12: String? = null
    var check13: String? = null
    var check21: String? = null
    var check22: String? = null
    var check23: String? = null
    var check31: String? = null
    var check32: String? = null
    var check33: String? = null


    var resetButton: Button? = null
    var switcher: Int = 0

    var score1 = 0
    var score2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playing_screen)

        img11 = findViewById(R.id.image_view11)
        img12 = findViewById(R.id.image_view12)
        img13 = findViewById(R.id.image_view13)
        img21 = findViewById(R.id.image_view21)
        img22 = findViewById(R.id.image_view22)
        img23 = findViewById(R.id.image_view23)
        img31 = findViewById(R.id.image_view31)
        img32 = findViewById(R.id.image_view32)
        img33 = findViewById(R.id.image_view33)

        player1_name = findViewById(R.id.player_1)
        player2_name = findViewById(R.id.player_2)
        player1_score = findViewById(R.id.player1_score)
        player2_score = findViewById(R.id.player2_score)

        resetButton = findViewById(R.id.reset_Button)

        resetButton?.setOnClickListener({
            reset()
        })

        img11?.setOnClickListener({
            if (switcher == 0) {
                img11?.setBackgroundResource(R.drawable.cross_red)
                switcher = 1
                check11 = "R"
            } else if (switcher == 1) {
                img11?.setBackgroundResource(R.drawable.tick_green)
                switcher = 0
                check11 = "G"
            }
            winner()
        })
        img12?.setOnClickListener({
            if (switcher == 0) {
                img12?.setBackgroundResource(R.drawable.cross_red)
                switcher = 1
                check12 = "R"
            } else if (switcher == 1) {
                img12?.setBackgroundResource(R.drawable.tick_green)
                switcher = 0
                check12 = "G"
            }
            winner()
        })
        img13?.setOnClickListener({
            if (switcher == 0) {
                img13?.setBackgroundResource(R.drawable.cross_red)
                switcher = 1
                check13 = "R"
            } else if (switcher == 1) {
                img13?.setBackgroundResource(R.drawable.tick_green)
                switcher = 0
                check13 = "G"
            }
            winner()
        })
        img21?.setOnClickListener({
            if (switcher == 0) {
                img21?.setBackgroundResource(R.drawable.cross_red)
                switcher = 1
                check21 = "R"
            } else if (switcher == 1) {
                img21?.setBackgroundResource(R.drawable.tick_green)
                switcher = 0
                check21 = "G"
            }
            winner()
        })
        img22?.setOnClickListener({
            if (switcher == 0) {
                img22?.setBackgroundResource(R.drawable.cross_red)
                switcher = 1
                check22 = "R"
            } else if (switcher == 1) {
                img22?.setBackgroundResource(R.drawable.tick_green)
                switcher = 0
                check22 = "G"
            }
            winner()
        })
        img23?.setOnClickListener({
            if (switcher == 0) {
                img23?.setBackgroundResource(R.drawable.cross_red)
                switcher = 1
                check23 = "R"
            } else if (switcher == 1) {
                img23?.setBackgroundResource(R.drawable.tick_green)
                switcher = 0
                check23 = "G"
            }
            winner()
        })
        img31?.setOnClickListener({
            if (switcher == 0) {
                img31?.setBackgroundResource(R.drawable.cross_red)
                switcher = 1
                check31 = "R"
            } else if (switcher == 1) {
                img31?.setBackgroundResource(R.drawable.tick_green)
                switcher = 0
                check31 = "G"
            }
            winner()
        })
        img32?.setOnClickListener({
            if (switcher == 0) {
                img32?.setBackgroundResource(R.drawable.cross_red)
                switcher = 1
                check32 = "R"
            } else if (switcher == 1) {
                img32?.setBackgroundResource(R.drawable.tick_green)
                switcher = 0
                check32 = "G"
            }
            winner()
        })
        img33?.setOnClickListener({
            if (switcher == 0) {
                img33?.setBackgroundResource(R.drawable.cross_red)
                switcher = 1
                check33 = "R"
            } else if (switcher == 1) {
                img33?.setBackgroundResource(R.drawable.tick_green)
                switcher = 0
                check33 = "G"
            }
            winner()
        })
    }

    fun reset() {

        img11?.setBackgroundResource(R.drawable.thumbnail)
        img12?.setBackgroundResource(R.drawable.thumbnail)
        img13?.setBackgroundResource(R.drawable.thumbnail)
        img21?.setBackgroundResource(R.drawable.thumbnail)
        img22?.setBackgroundResource(R.drawable.thumbnail)
        img23?.setBackgroundResource(R.drawable.thumbnail)
        img31?.setBackgroundResource(R.drawable.thumbnail)
        img32?.setBackgroundResource(R.drawable.thumbnail)
        img33?.setBackgroundResource(R.drawable.thumbnail)

        check11 = null
        check12 = null
        check13 = null
        check21 = null
        check22 = null
        check23 = null
        check31 = null
        check32 = null
        check33 = null


    }

    private fun winner() {
        var player1 = 0
        var player2 = 0


        //row1
        if (check11.equals(check12, true) && check12.equals(check13, true) && check12.equals("R", true)) {
            //Toast.makeText(this@PlayingScreen, "Player 1 Wins", Toast.LENGTH_SHORT).show()
            player1 += 1
        } else if (check11.equals(check12, true) && check12.equals(check13, true) && check12.equals("G", true)) {
            //Toast.makeText(this@PlayingScreen, "Player 2 Wins", Toast.LENGTH_SHORT).show()
            player2 += 1

        }
        //row2
        else if (check21.equals(check22, true) && check22.equals(check23, true) && check22.equals("R", true)) {
            //Toast.makeText(this@PlayingScreen, "Player 1 Wins", Toast.LENGTH_SHORT).show()
            player1 += 1
        } else if (check21.equals(check22, true) && check22.equals(check23, true) && check22.equals("G", true)) {
            //Toast.makeText(this@PlayingScreen, "Player 2 Wins", Toast.LENGTH_SHORT).show()
            player2 += 1
        }
        //row3
        else if (check31.equals(check32, true) && check32.equals(check33, true) && check33.equals("R", true)) {
            //Toast.makeText(this@PlayingScreen, "Player 1 Wins", Toast.LENGTH_SHORT).show()
            player1 += 1
        } else if (check31.equals(check32, true) && check32.equals(check33, true) && check33.equals("G", true)) {
            //Toast.makeText(this@PlayingScreen, "Player 2 Wins", Toast.LENGTH_SHORT).show()
            player2 += 1
        }
        //column1
        else if (check11.equals(check21, true) && check21.equals(check31, true) && check21.equals("R", true)) {
            //Toast.makeText(this@PlayingScreen, "Player 1 Wins", Toast.LENGTH_SHORT).show()
            player1 += 1
        } else if (check11.equals(check21, true) && check21.equals(check31, true) && check21.equals("G", true)) {
            //Toast.makeText(this@PlayingScreen, "Player 2 Wins", Toast.LENGTH_SHORT).show()
            player2 += 1
        }
        //column2
        else if (check12.equals(check22, true) && check22.equals(check32, true) && check22.equals("R", true)) {
            //Toast.makeText(this@PlayingScreen, "Player 1 Wins", Toast.LENGTH_SHORT).show()
            player1 += 1
        } else if (check12.equals(check22, true) && check22.equals(check32, true) && check22.equals("G", true)) {
            //Toast.makeText(this@PlayingScreen, "Player 2 Wins", Toast.LENGTH_SHORT).show()
            player2 += 1
        }
        //column3
        else if (check13.equals(check23, true) && check23.equals(check33, true) && check23.equals("R", true)) {
            //Toast.makeText(this@PlayingScreen, "Player 1 Wins", Toast.LENGTH_SHORT).show()
            player1 += 1
        } else if (check13.equals(check23, true) && check23.equals(check33, true) && check23.equals("G", true)) {
            // Toast.makeText(this@PlayingScreen, "Player 2 Wins", Toast.LENGTH_SHORT).show()
            player2 += 1
        }

        //diagonal 1
        else if (check11.equals(check22, true) && check22.equals(check33, true) && check22.equals("R", true)) {
            // Toast.makeText(this@PlayingScreen, "Player 1 Wins", Toast.LENGTH_SHORT).show()
            player1 += 1
        } else if (check11.equals(check22, true) && check22.equals(check33, true) && check22.equals("G", true)) {
            // Toast.makeText(this@PlayingScreen, "Player 2 Wins", Toast.LENGTH_SHORT).show()
            player2 += 1
        }
        //diagonal 2
        else if (check13.equals(check22, true) && check22.equals(check31, true) && check22.equals("R", true)) {
            // Toast.makeText(this@PlayingScreen, "Player 1 Wins", Toast.LENGTH_SHORT).show()
            player1 += 1
        } else if (check13.equals(check22, true) && check22.equals(check31, true) && check22.equals("G", true)) {
            // Toast.makeText(this@PlayingScreen, "Player 2 Wins", Toast.LENGTH_SHORT).show()
            player2 += 1
        }
        if (player1 > player2) {
            Toast.makeText(this@PlayingScreen, "Player X Wins", Toast.LENGTH_SHORT).show()
            score1 += 1
            player1_score?.setText(String.format("%d", score1))

        } else if (player2 > player1) {
            Toast.makeText(this@PlayingScreen, "Player O Wins", Toast.LENGTH_SHORT).show()
            score2 += 1
            player2_score?.setText(String.format("%d", score2))

        }

    }
}
