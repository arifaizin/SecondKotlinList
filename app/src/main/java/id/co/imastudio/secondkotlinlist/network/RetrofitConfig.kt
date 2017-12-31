package id.co.imastudio.secondkotlinlist.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by idn on 12/31/2017.
 */
class RetrofitConfig {
    val retrofit = Retrofit.Builder()
            .baseUrl("https://script.google.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val service = retrofit.create<ApiService>(ApiService::class.java!!)
}