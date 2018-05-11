package id.co.imastudio.menghitungbangundatar

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        //ngapain
        btnKali.setOnClickListener({
            pesan(kali(edtInput1, edtInput2), this)
        })

        btnBagi.setOnClickListener({
            pesan(bagi(edtInput1, edtInput2), this)
        })

        btnKurang.setOnClickListener({
            pesan(kurang(bil2 = edtInput2,bil1 = edtInput1), this)
        })
        btnTambah.setOnClickListener({
            pesan(tambah(edtInput1, edtInput2),this)
        })
    }

    fun tambah (bil1 : EditText, bil2 :EditText) : String{
        val hasil = bil1.text.toString().toInt() + bil2.text.toString().toInt()
        return  hasil.toString()
    }

    fun kali (bil1 : EditText, bil2 :EditText) : String{
        val hasil = bil1.text.toString().toInt() * bil2.text.toString().toInt()
        return  hasil.toString()
    }

    fun bagi (bil1 : EditText, bil2 :EditText) : String{
        val hasil = bil1.text.toString().toInt() / bil2.text.toString().toInt()
        return  hasil.toString()
    }
    fun kurang (bil1 : EditText, bil2 :EditText) : String{
        val hasil = bil1.text.toString().toInt() - bil2.text.toString().toInt()
        return  hasil.toString()
    }

    fun pesan (hasil : String, context: Context){
        Toast.makeText(context, hasil, Toast.LENGTH_SHORT).show()
    }
}
