package id.co.imastudio.secondkotlinlist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import id.co.imastudio.secondkotlinlist.network.RetrofitConfig
import id.co.imastudio.secondkotlinlist.response.ResponseWisata
import kotlinx.android.synthetic.main.activity_recycler_view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


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

        var getConfig = RetrofitConfig().service
        var getRequest = getConfig.request_wisata()

        getRequest.enqueue(object : Callback<ResponseWisata> {
            override fun onFailure(call: Call<ResponseWisata>?, t: Throwable?) {
                Log.d("Error server", t?.message)
            }

            override fun onResponse(call: Call<ResponseWisata>?, response: Response<ResponseWisata>?) {
//                Log.d("Status server", response?.message())
//                Log.d("Response json", response?.body().toString())

                //null asserted null atau null exception !!
                if (response?.isSuccessful!!){
                    var alljson = response.body()
                    var jsonSemarang = alljson?.semarang

                    var adapter = CustomAdapter(jsonSemarang, applicationContext)
                    recyclerview.adapter = adapter
                }

            }
        })


        recyclerview.layoutManager = LinearLayoutManager(this)
    }
}


