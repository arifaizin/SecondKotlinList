package id.co.imastudio.secondkotlinlist

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import id.co.imastudio.secondkotlinlist.response.SemarangItem
import kotlinx.android.synthetic.main.recycler_item.view.*

/**
 * Created by idn on 12/30/2017.
 */
//class CustomAdapter(listdata: List<SemarangItem?>?, gambar: Array<Int>, jmlrating: Array<Int>) : RecyclerView.Adapter<CustomAdapter.MyHolder>() {
class CustomAdapter(listdata: List<SemarangItem?>?, context: Context?) : RecyclerView.Adapter<id.co.imastudio.secondkotlinlist.CustomAdapter.MyHolder>() {

//    lateinit var nama: Array<String>
//    lateinit var gambar: Array<Int>
//    lateinit var jmlrating: Array<Int>
//    //lateinit buat inisialisasi di akhir
//
//    init {
//            this.nama = nama
//            this.gambar = gambar
//            this.jmlrating = jmlrating
//    }

    lateinit var listdata : List<SemarangItem?>
    lateinit var context : Context
    init {
        this.listdata = listdata!!
        this.context = context!!
    }


    override fun getItemCount(): Int {
        return listdata.size
    }

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {
        holder?.bind(position)
        //? bakal null, tmabahin ?
        // kalt + enter > createe member
        //add paramerter

//        holder?.itemView?.item_namabuah?.text= nama.get(position)
//        holder?.itemView?.item_gambarbuah?.setImageResource(gambar.get(position))
//        holder?.itemView?.item_rating?.rating = jmlrating.get(position).toFloat()

        holder?.itemView?.item_namabuah?.text= listdata.get(position)?.namaWisata
        Picasso.with(context).load("https://drive.google.com/thumbnail?id="+listdata.get(position)?.gambarWisata).into(holder?.itemView?.item_gambarbuah)

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {
        var itemview = LayoutInflater.from(parent?.context).inflate(R.layout.recycler_item, parent, false)
        //? bisa null atau tidak
        return MyHolder(itemview)
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        //tambah extend sendiri
        fun bind(position: Int) {
//            itemView.item_namabuah.text = nama.get(position)
//            itemView.item_gambarbuah.setImageResource(gambar.get(position))

        }

    }
}