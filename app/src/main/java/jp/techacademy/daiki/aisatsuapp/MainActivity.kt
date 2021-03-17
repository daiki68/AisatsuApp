package jp.techacademy.daiki.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

        }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("aisatsu", "$hour:$minute")

                val a = hour

                if (a in 2 .. 9) {
                Log.d("aisatsu", "おはよう")
                    textView.text = "おはよう"
            } else if (a in 10 .. 18) {
                Log.d("aisatsu", "こんにちは")
                    textView.text = "こんにちは"
            } else {
                Log.d("aisatsu", "こんばんは")
                    textView.text = "こんばんは"
            }

            },
            0, 0, true)
        timePickerDialog.show()
    }
}