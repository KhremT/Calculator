package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etextb:EditText=findViewById(R.id.etext)
        val Acb:Button = findViewById(R.id.Ac)
        val leraseb: Button =findViewById(R.id.lerase)
        val divideb: Button =findViewById(R.id.divide)
        val multiplyb: Button =findViewById(R.id.multiply)
        val plusb:Button = findViewById(R.id.plus)
        val minusb:Button = findViewById(R.id.minus)
        val equalb: Button =findViewById(R.id.equal)
        val sevenb: Button =findViewById(R.id.seven)
        val eightb: Button =findViewById(R.id.eight)
        val nineb: Button =findViewById(R.id.nine)
        val fourb: Button =findViewById(R.id.four)
        val fiveb: Button =findViewById(R.id.five)
        val sixb: Button =findViewById(R.id.six)
        val oneb: Button =findViewById(R.id.one)
        val twob: Button =findViewById(R.id.two)
        val threeb: Button =findViewById(R.id.three)
        val zerob: Button =findViewById(R.id.zero)
        val dotb: Button =findViewById(R.id.dot)


        zerob.setOnClickListener()
        {
            etextb.setText(etextb.text.toString() + "0")
        }
       oneb.setOnClickListener()
       {
           etextb.setText(etextb.text.toString() + "1")
       }
        twob.setOnClickListener()
        {
            etextb.setText(etextb.text.toString() + "2")
        }
        threeb.setOnClickListener()
        {
            etextb.setText(etextb.text.toString() + "3")
        }
        fourb.setOnClickListener()
        {
            etextb.setText(etextb.text.toString() + "4")
        }
        fiveb.setOnClickListener()
        {
            etextb.setText(etextb.text.toString() + "5")
        }
        sixb.setOnClickListener()
        {
            etextb.setText(etextb.text.toString() + "6")
        }
        sevenb.setOnClickListener()
        {
            etextb.setText(etextb.text.toString() + "7")
        }
        eightb.setOnClickListener()
        {
            etextb.setText(etextb.text.toString() + "8")
        }
        nineb.setOnClickListener()
        {
            etextb.setText(etextb.text.toString() + "9")
        }
       dotb.setOnClickListener()
        {
            etextb.setText(etextb.text.toString() + ".")
        }
        Acb.setOnClickListener()
        {
            etextb.setText("")
        }
        leraseb.setOnClickListener()
        {
            if (etextb.text.toString().length == 0)
            {
                Toast.makeText(this@MainActivity,"Nothing to erase",Toast.LENGTH_SHORT).show()
            }
            else
            {
                etextb.setText(etextb.text.toString().substring(0, etextb.text.toString().length - 1))
            }
        }

        plusb.setOnClickListener()
        {
            if (etextb.text.toString().length == 0)
            {
                Toast.makeText(this@MainActivity,"Need Digits!",Toast.LENGTH_SHORT).show()
            }
            else {

                var last: Char = etextb.text[etextb.text.length - 1]

                if ((last != '+') && (last != '-') && (last != '*') && (last != '/'))
                {
                    etextb.setText(etextb.getText().toString() + "+")

                }
                else
                {
                    Toast.makeText(this@MainActivity, "Operator already Inserted!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        minusb.setOnClickListener()
        {
            if (etextb.text.toString().length == 0)
            {
                Toast.makeText(this@MainActivity,"Need Digits!",Toast.LENGTH_SHORT).show()
            }
            else {

                var last: Char = etextb.text[etextb.text.length - 1]

                if ((last != '+') && (last != '-') && (last != '*') && (last != '/'))
                {
                    etextb.setText(etextb.getText().toString() + "-")

                }
                else
                {
                    Toast.makeText(this@MainActivity, "Operator already Inserted!", Toast.LENGTH_SHORT).show()
                }
            }
        }

        multiplyb.setOnClickListener()
        {
            if (etextb.text.toString().length == 0)
            {
                Toast.makeText(this@MainActivity,"Need Digits!",Toast.LENGTH_SHORT).show()
            }
            else {

                var last: Char = etextb.text[etextb.text.length - 1]

                if ((last != '+') && (last != '-') && (last != '*') && (last != '/'))
                {
                    etextb.setText(etextb.getText().toString() + "*")

                }
                else
                {
                    Toast.makeText(this@MainActivity, "Operator already Inserted!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        divideb.setOnClickListener()
        {
            if (etextb.text.toString().length == 0)
            {
                Toast.makeText(this@MainActivity,"Need Digits!",Toast.LENGTH_SHORT).show()
            }
            else {

                var last: Char = etextb.text[etextb.text.length - 1]

                if ((last != '+') && (last != '-') && (last != '*') && (last != '/'))
                {
                    etextb.setText(etextb.getText().toString() + "/")

                }
                else
                {
                    Toast.makeText(this@MainActivity, "Operator already Inserted!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        equalb.setOnClickListener()
        {
            if (etextb.text.toString().length == 0)
            {
                Toast.makeText(this@MainActivity, "Need Digits!", Toast.LENGTH_SHORT).show()
            }
            else
            {
                var intlist = etextb.text.toString().split("+", "*", "-", "/")
                val oplist: MutableList<Char> = mutableListOf()

                for (i in etextb.text.toString())
                {
                    if (i == '+' || i == '-' || i == '*' || i == '/')
                    {
                        oplist.add(i)
                    }
                }

                var result: Float = 0.0F
                var index: Int = 0;
                for (i in 0..oplist.size - 1) {
                    if (oplist[i] == '+') {
                        if (i == 0) {
                            result = intlist[index].toFloat() + intlist[++index].toFloat()
                        } else {
                            result = result + intlist[++index].toFloat()
                        }

                    } else if (oplist[i] == '-') {
                        if (i == 0) {
                            result = intlist[index].toFloat() - intlist[++index].toFloat()
                        } else {
                            result = result - intlist[++index].toFloat()
                        }

                    } else if (oplist[i] == '*') {
                        if (i == 0) {
                            result = intlist[index].toFloat() * intlist[++index].toFloat()
                        } else {
                            result = result * intlist[++index].toFloat()
                        }

                    } else if (oplist[i] == '/') {
                        if (i == 0) {
                            result = intlist[index].toFloat() / intlist[++index].toFloat()
                        } else {
                            result = result / intlist[++index].toFloat()
                        }

                    }
                }

                etextb.setText(result.toString())
            }
        }

    }
}