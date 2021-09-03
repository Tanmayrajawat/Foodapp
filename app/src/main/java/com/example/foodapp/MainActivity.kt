package com.example.foodapp

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {
    var name = arrayOf("VEG CHEESE BURGER", "TIS SPECIAL BURGER", "PANEER WRAPPED PIZZA", "CORN MAYO SANDWICH", "CHEESE SANDWICH")
    var price = arrayOf<String>("Rs 60", "Rs 100", "Rs 175", "Rs 75", "Rs 65")
    var image = arrayOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listview.adapter = MyListAdapter(this, name, price, image)
        listview.setOnItemClickListener { parent, view, position, id ->
            var recipe

        }

    }


    class MyListAdapter(

        private val context: Activity,

        private val personName: Array<String>,

        private val price: Array<String>,

        private val contactImage: Array<Int>

    ) : ArrayAdapter<String>(context, R.layout.custom_list, personName) {

        override fun getView(position: Int, convertView: View?, parent: ViewGroup) {
            val inflater = context.layoutInflater
            val rowView = inflater.inflate(R.layout.custom_list, null, true)
            rowView.contact_name.text = personName[position]
            rowView.phone_number.text = price[position].tostring()
            rowView.contact icon . setImageResource (contactImage[position])
            return rowView

        }
    }
}
