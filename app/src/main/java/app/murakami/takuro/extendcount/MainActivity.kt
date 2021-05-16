package app.murakami.takuro.extendcount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number: Int =0;
        var position: Float =20.0F;

        imageView.setX(20f);

        gobutton.setOnClickListener{
            position += 30F
            number += 1
            textview.text = "GO"
            imageView.setX(position);
            count.text = number.toString()
        }
        backbutton.setOnClickListener{
            position -= 30F
            number -= 1
            textview.text = "BACK"
            imageView.setX(position);
            count.text = number.toString()
        }



    }
}