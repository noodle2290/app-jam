package app.murakami.takuro.extendcount

import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number: Int = 0;
        var position: Float = 20.0F;
        val Sound = MediaPlayer.create(this, R.raw.whistle)

        imageView.setX(20f)
        gobutton.setOnClickListener {
            if (number < 65) {
                position += 10F
                number += 1
                textview.text = "GO"
                imageView.setX(position);
                count.text = number.toString()
            } else if (number == 65) {
                number += 1
                position += 10F
                imageView.setX(position);
                gobutton.text = "Restart"
                gobutton.setBackgroundColor(Color.GREEN)
                textview.text = "GOAL"
                Sound.start()
            } else {
                position = 20.0F
                number = 0
                imageView.setX(position);
                textview.text = "GO"
                count.text = number.toString()
                gobutton.text = "GO"
                gobutton.setBackgroundColor(Color.RED)
            }
        }
    }
}