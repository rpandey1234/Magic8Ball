package edu.stanford.rkpandey.magic8ball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val answers = listOf("Definitely!",
            "No way",
            "Ask my mom",
            "Perhaps",
            "Ask again",
            "Plausible",
            "Hazy",
            "Almost certainly")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get notified when the user has clicked on the button
        btnAnswer.setOnClickListener {
            // Code here will run everytime we click on the button!
            Log.i("magic", "clicked on the button!")
            // Replace the text of the bottom text view with a new random answer
            val randomAnswer = answers.random()
            tvAnswer.text = randomAnswer
            editText.text.clear()
        }
    }
}