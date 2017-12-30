package id.co.imastudio.secondkotlinlist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {


    var namabuah = arrayOf("Alpukat", "Apel", "Ceri", "Durian", "Jambu Air", "Manggis", "Strawberry")

    var gambarbuah = arrayOf(
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.strawberry
            )

    var jmlrating = arrayOf(1, 2, 3, 4, 5, 6, 7)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        var adapter = CustomAdapter(namabuah, gambarbuah, jmlrating)
        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this)
    }
}
