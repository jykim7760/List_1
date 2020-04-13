package com.practice.test.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.practice.test.R
import com.practice.test.source.data


class Adapter (context:Context, resId:Int, list:ArrayList<data>) : ArrayAdapter<data> (context, resId, list)

{
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.app, null)

        }
        val row = tempRow!!


        val name = row.findViewById<TextView>(R.id.name)
        val company = row.findViewById<TextView>(R.id.companyName)
        val i1 = row.findViewById<ImageView>(R.id.i1)
        val i2 = row.findViewById<ImageView>(R.id.i2)
        val i3 = row.findViewById<ImageView>(R.id.i3)
        val i4 = row.findViewById<ImageView>(R.id.i4)
        val i5 = row.findViewById<ImageView>(R.id.i5)


        val data = mList.get(position)

  company.text = data.company
        name.text = "${position+1}.${data.name}"

//        평점 표시
        val starList = ArrayList<ImageView>()
        starList.add(i1)
        starList.add(i2)
        starList.add(i3)
        starList.add(i4)
        starList.add(i5)

        for (index in 0..4) {
            val star = starList.get(index)

            if (index < data.star){
                star.setImageResource(R.drawable.fill_star)
            }
            else{
                star.setImageResource(R.drawable.empty_star)
            }

        }




        return row

    }


}
