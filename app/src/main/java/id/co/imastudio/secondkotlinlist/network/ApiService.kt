package id.co.imastudio.secondkotlinlist.network

import id.co.imastudio.secondkotlinlist.response.ResponseWisata
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by idn on 12/31/2017.
 */
interface ApiService {
    @GET("macros/s/AKfycby-jbgwKHEvnMbXo3yaW86EulRpsP59AAY2_p5CEDsjfIHqtXMK/exec?sheet=semarang")
    fun request_wisata():Call<ResponseWisata>
}