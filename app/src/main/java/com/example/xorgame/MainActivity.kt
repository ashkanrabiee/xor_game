package com.example.xorgame

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //start project and add id from activity_main.xml here
        var resbtn = findViewById<Button>(R.id.resbtn) as Button
        var bu1 = findViewById<Button>(R.id.bu1) as Button
        var bu2 = findViewById<Button>(R.id.bu2) as Button
        var bu3 = findViewById<Button>(R.id.bu3) as Button
        var bu4 = findViewById<Button>(R.id.bu4) as Button
        var bu5 = findViewById<Button>(R.id.bu5) as Button
        var bu6 = findViewById<Button>(R.id.bu6) as Button
        var bu7 = findViewById<Button>(R.id.bu7) as Button
        var bu8 = findViewById<Button>(R.id.bu8) as Button
        var bu9 = findViewById<Button>(R.id.bu9) as Button






        resbtn.setOnClickListener {
            val Alert = androidx.appcompat.app.AlertDialog.Builder(this)
            Alert.setTitle("RESERT GAME")
            Alert.setMessage("do you want play again ?")
            Alert.setPositiveButton("RESET") {
                Alert, which->
                Toast.makeText(this,"ye dast digeh mehmon ma bash ",Toast.LENGTH_LONG).show()
                bu1.text= ""
                bu2.text= ""
                bu3.text= ""
                bu4.text= ""
                bu5.text= ""
                bu6.text= ""
                bu7.text= ""
                bu8.text= ""
                bu9.text= ""
                bu1.setBackgroundColor(Color.WHITE)
                bu2.setBackgroundColor(Color.WHITE)
                bu3.setBackgroundColor(Color.WHITE)
                bu4.setBackgroundColor(Color.WHITE)
                bu5.setBackgroundColor(Color.WHITE)
                bu6.setBackgroundColor(Color.WHITE)
                bu7.setBackgroundColor(Color.WHITE)
                bu8.setBackgroundColor(Color.WHITE)
                bu9.setBackgroundColor(Color.WHITE)
                bu1.isEnabled=true
                bu2.isEnabled=true
                bu3.isEnabled=true
                bu4.isEnabled=true
                bu5.isEnabled=true
                bu6.isEnabled=true
                bu7.isEnabled=true
                bu8.isEnabled=true
                bu9.isEnabled=true
                playerOne.clear()
                playerTwo.clear()


            }
          Alert.setNegativeButton("stay"){
              Alert,which->
              Toast.makeText(this,"aga damet garm mondi ",Toast.LENGTH_LONG).show()

              bu1.isEnabled=false
              bu2.isEnabled=false
              bu3.isEnabled=false
              bu4.isEnabled=false
              bu5.isEnabled=false
              bu6.isEnabled=false
              bu7.isEnabled=false
              bu8.isEnabled=false
              bu9.isEnabled=false
          }
        Alert.setNegativeButton("EXIT"){
            Alert,which->
            Toast.makeText(this,"haji montazeretim",Toast.LENGTH_LONG).show()
            finish()
        }
        Alert.show()
        }
    }


    fun buclick(v: View) {
        var id: Int = 0
        var btnselect = v as Button
        when (btnselect.id) {
            R.id.bu1 -> id = 1
            R.id.bu2 -> id = 2
            R.id.bu3 -> id = 3
            R.id.bu4 -> id = 4
            R.id.bu5 -> id = 5
            R.id.bu6 -> id = 6
            R.id.bu7 -> id = 7
            R.id.bu8 -> id = 8
            R.id.bu9 -> id = 9

        }
//        Toast.makeText(this,id.toString(),Toast.LENGTH_LONG).show()
        startGame(id, btnselect)
    }


    var playerOne = ArrayList<Int>()
    var playerTwo = ArrayList<Int>()
    var activePlayer = 1
    fun startGame(id: Int, btnselect: Button) {
        if (activePlayer == 1) {
            btnselect.text = "x"
            btnselect.setBackgroundColor(Color.GREEN)
            activePlayer = 2
            playerOne.add(id)

        } else {
            btnselect.text = "O"
            btnselect.setBackgroundColor(Color.BLUE)
            playerTwo.add(id)
            activePlayer = 1
        }
        btnselect.isEnabled = false
        if (winner() == 1) {
            Toast.makeText(this, "winner is player one ", Toast.LENGTH_LONG).show()
        } else if (winner() == 2) {
            Toast.makeText(this, "winner is player two ", Toast.LENGTH_LONG).show()
        }

    }

    fun winner(): Int {
        // todo btn one codes
        if (playerOne.contains(1) && playerOne.contains(2) && playerOne.contains(3)) {
            return 1
        }
        if (playerOne.contains(1) && playerOne.contains(3) && playerOne.contains(7)) {
            return 1
        }
        if (playerOne.contains(1) && playerOne.contains(5) && playerOne.contains(9)) {
            return 1
        }
//        //////////////////////////////////////////////////////////
//        todo btn two codes
        if (playerOne.contains(2) && playerOne.contains(3) && playerOne.contains(1)) {
            return 1
        }
        if (playerOne.contains(2) && playerOne.contains(1) && playerOne.contains(3)) {
            return 1
        }
        if (playerOne.contains(2) && playerOne.contains(5) && playerOne.contains(8)) {
            return 1
        }
///////////////////////////////////////
        //todo btn three codes
        if (playerOne.contains(3) && playerOne.contains(2) && playerOne.contains(1)) {
            return 1
        }
        if (playerOne.contains(3) && playerOne.contains(6) && playerOne.contains(9)) {
            return 1
        }
        /////////////////////////////////////
        //todo four codes
        if (playerOne.contains(4) && playerOne.contains(1) && playerOne.contains(7)) {
            return 1
        }
        if (playerOne.contains(4) && playerOne.contains(5) && playerOne.contains(6)) {
            return 1
        }
        ////////////////////////////////////
        //todo five codes
        if (playerOne.contains(5) && playerOne.contains(6) && playerOne.contains(4)) {
            return 1
        }
        if (playerOne.contains(5) && playerOne.contains(4) && playerOne.contains(6)) {
            return 1
        }
        if (playerOne.contains(5) && playerOne.contains(2) && playerOne.contains(8)) {
            return 1
        }
        if (playerOne.contains(5) && playerOne.contains(3) && playerOne.contains(7)) {
            return 1
        }
        if (playerOne.contains(5) && playerOne.contains(7) && playerOne.contains(3)) {
            return 1
        }
        ///////////////////////////////////
        //todo six codes
        if (playerOne.contains(6) && playerOne.contains(3) && playerOne.contains(9)) {
            return 1
        }
        if (playerOne.contains(6) && playerOne.contains(5) && playerOne.contains(4)) {
            return 1
        }
        ////////////////////////////////
        //todo seven codes
        if (playerOne.contains(7) && playerOne.contains(5) && playerOne.contains(1)) {
            return 1
        }
        if (playerOne.contains(7) && playerOne.contains(8) && playerOne.contains(9)) {
            return 1
        }
        ////////////////////////////////////
        //todo eight codes
        if (playerOne.contains(8) && playerOne.contains(9) && playerOne.contains(7)) {
            return 1
        }
        if (playerOne.contains(8) && playerOne.contains(5) && playerOne.contains(2)) {
            return 1
        }
        /////////////////////////////////////////
        //todo nine codes
        if (playerOne.contains(9) && playerOne.contains(8) && playerOne.contains(7)) {
            return 1
        }
        if (playerOne.contains(9) && playerOne.contains(6) && playerOne.contains(3)) {
            return 1
        }
        ///////////////////////////////////////////////
        // todo code playewr two

        if (playerTwo.contains(1) && playerTwo.contains(2) && playerTwo.contains(3)) {
            return 2
        }
        if (playerTwo.contains(1) && playerTwo.contains(4) && playerTwo.contains(7)) {
            return 2
        }
        if (playerTwo.contains(1) && playerTwo.contains(5) && playerTwo.contains(9)) {
            return 2
        }
//        //////////////////////////////////////////////////////////
        //  todo btn two codes


        if (playerTwo.contains(2) && playerTwo.contains(3) && playerTwo.contains(1)) {
            return 2
        }
        if (playerTwo.contains(2) && playerTwo.contains(5) && playerTwo.contains(8)) {
            return 2
        }
// /////////////////////////////////////
        //todo btn three codes
        if (playerTwo.contains(3) && playerTwo.contains(2) && playerTwo.contains(1)) {
            return 2
        }
        if (playerTwo.contains(3) && playerTwo.contains(6) && playerTwo.contains(9)) {
            return 2
        }
        /////////////////////////////////////
        //todo four codes
        if (playerTwo.contains(4) && playerTwo.contains(1) && playerOne.contains(7)) {
            return 2
        }
        if (playerTwo.contains(4) && playerTwo.contains(5) && playerTwo.contains(6)) {
            return 2
        }
        ////////////////////////////////////
        //todo five codes
        if (playerTwo.contains(5) && playerTwo.contains(6) && playerTwo.contains(4)) {
            return 2
        }
        if (playerTwo.contains(5) && playerTwo.contains(3) && playerTwo.contains(7)) {
            return 2
        }
        if (playerTwo.contains(5) && playerTwo.contains(1) && playerTwo.contains(9)) {
            return 2
        }
        ///////////////////////////////////
        //todo six codes
        if (playerTwo.contains(6) && playerTwo.contains(3) && playerTwo.contains(9)) {
            return 2
        }
        if (playerTwo.contains(6) && playerTwo.contains(5) && playerTwo.contains(4)) {
            return 2
        }
        ////////////////////////////////
        //todo seven codes
        if (playerTwo.contains(7) && playerTwo.contains(5) && playerTwo.contains(1)) {
            return 2
        }
        if (playerTwo.contains(7) && playerTwo.contains(8) && playerTwo.contains(9)) {
            return 2
        }
        ////////////////////////////////////
        //todo eight codes
        if (playerTwo.contains(8) && playerTwo.contains(9) && playerTwo.contains(7)) {
            return 2
        }
        if (playerTwo.contains(8) && playerTwo.contains(5) && playerTwo.contains(2)) {
            return 2
        }
        /////////////////////////////////////////
        //todo nine codes
        if (playerTwo.contains(9) && playerTwo.contains(8) && playerTwo.contains(7)) {
            return 2
        }
        if (playerTwo.contains(9) && playerTwo.contains(6) && playerTwo.contains(3)) {
            return 2
        }
        return 0


    }
}