package id.co.imastudio.secondkotlinlist.response

import com.google.gson.annotations.SerializedName

data class ResponseWisata(

	@field:SerializedName("semarang")
	val semarang: List<SemarangItem?>? = null
)

