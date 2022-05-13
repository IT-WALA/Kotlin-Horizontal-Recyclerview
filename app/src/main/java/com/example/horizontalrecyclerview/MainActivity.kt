package com.example.recyclerviewhorizontal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.horizontalrecyclerview.ModelClass
import com.example.horizontalrecyclerview.MyAdapter
import com.example.horizontalrecyclerview.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var arrayList = ArrayList<ModelClass>()
    private var data = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myAdapter = MyAdapter(this, getData())
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                LinearLayoutManager.HORIZONTAL
            )
        )
        recyclerView.adapter = myAdapter
    }

    private fun getData(): ArrayList<ModelClass> {
        for (i in data.indices) {
            arrayList.add(ModelClass(data[i]))
        }
        return arrayList
    }
}