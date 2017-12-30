package id.co.imastudio.secondkotlinlist

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnListview.setOnClickListener(this)
        btnRecycler.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
//        if (p0 == btnListview){
//
//        } else if (p0 == btnRecycler){
//
//        }

        when(p0){
            btnListview -> {
                startActivity(Intent(this, ListViewActivity::class.java));
            }
            btnRecycler -> {
                var intent = Intent(this, RecyclerViewActivity::class.java)
                startActivity(intent);
            }
        }
    }
}
