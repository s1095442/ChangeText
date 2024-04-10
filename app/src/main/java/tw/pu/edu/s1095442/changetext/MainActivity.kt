package tw.pu.edu.s1095442.changetext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity(),OnClickListener {

    lateinit var  txv:TextView
    var size:Float=20f

    lateinit var btnA:Button
    lateinit var btnB:Button
    lateinit var imageView2:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txv = findViewById(R.id.txv)
        txv.text ="作者:林佳"
        txv.textSize= size
        txv.setOnClickListener(object:OnClickListener{
            override fun onClick(v: View?) {
                txv.text="文字短按"
            }

        })

        btnA= findViewById(R.id.btnA)
        btnA.setOnClickListener(this)

        btnB= findViewById(R.id.btnB)
        btnB.setOnClickListener(this)

        imageView2= findViewById(R.id.imageView2)
        imageView2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v==btnA){
            size++
            txv.textSize=size
        }
        else if(v==btnB){
            size--
            txv.textSize=size
        }
        else{
            txv.text="圖片短按"
        }

        if (size >= 30) { btnA.isEnabled = false }
        else if (size <= 10) { btnB.isEnabled = false }
        else{
            btnA.isEnabled = true
            btnB.isEnabled = true
        }

    }
}