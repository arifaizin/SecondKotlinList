package id.co.imastudio.secondkotlinlist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    var data = arrayOf("Alpukat", "Apel", "Ceri", "Durian", "Mangga")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, data.get(i), Toast.LENGTH_SHORT).show()
        }

    }


}
