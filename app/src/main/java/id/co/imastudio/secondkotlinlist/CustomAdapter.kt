package id.co.imastudio.secondkotlinlist

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recycler_item.view.*

/**
 * Created by idn on 12/30/2017.
 */
class CustomAdapter(nama: Array<String>, gambar: Array<Int>, jmlrating: Array<Int>) : RecyclerView.Adapter<CustomAdapter.MyHolder>() {

    lateinit var nama: Array<String>
    lateinit var gambar: Array<Int>
    lateinit var jmlrating: Array<Int>
    //lateinit buat inisialisasi di akhir

    init {
            this.nama = nama
            this.gambar = gambar
            this.jmlrating = jmlrating
    }



    override fun getItemCount(): Int {
        return nama.size
    }

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {
        holder?.bind(position, nama, gambar)
        //? bakal null, tmabahin ?
        // kalt + enter > createe member
        //add paramerter

        holder?.itemView?.item_namabuah?.text= nama.get(position)
        holder?.itemView?.item_gambarbuah?.setImageResource(gambar.get(position))
        holder?.itemView?.item_rating?.rating = jmlrating.get(position).toFloat()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {
        var itemview = LayoutInflater.from(parent?.context).inflate(R.layout.recycler_item, parent, false)
        //? bisa null atau tidak
        return MyHolder(itemview)
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        //tambah extend sendiri
        fun bind(position: Int, nama: Array<String>, gambar: Array<Int>) {
//            itemView.item_namabuah.text = nama.get(position)
//            itemView.item_gambarbuah.setImageResource(gambar.get(position))

        }

    }
}