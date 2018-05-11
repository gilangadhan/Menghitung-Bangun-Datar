package id.co.imastudio.menghitungbangundatar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //biasa
        /*btnHitung.setOnClickListener({
            val panjang = edtPanjang.text.toString()
            val lebar = edtLebar.text.toString()
            val hitung = panjang.toInt() * lebar.toInt()
            Toast.makeText(this@MainActivity,
                    "Hasilnya ${hitung.toString()}",
                    Toast.LENGTH_SHORT).show()
        })*/

        //function biasa
        /*btnHitung.setOnClickListener({
            hitung()
        })*/

        //return function
        btnHitung.setOnClickListener({
            val hasil = Helper.hitung(edtPanjang, edtLebar)
            Toast.makeText(this@MainActivity,
                    "Hasilnya $hasil",
                    Toast.LENGTH_SHORT).show()
        })
    }
    //function tanpa pengembalian
    private fun hitung(){
        val panjang = edtPanjang.text.toString()
        val lebar = edtLebar.text.toString()
        val hitung = returnFunction(panjang.toInt(), lebar.toInt())
        Toast.makeText(this@MainActivity,
                "Hasilnya ${hitung.toString()}",
                Toast.LENGTH_SHORT).show()
    }
    private fun returnFunction(p : Int, l : Int) : Int{
        return  p * l
    }
}