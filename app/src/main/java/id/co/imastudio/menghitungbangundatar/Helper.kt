package id.co.imastudio.menghitungbangundatar

import android.widget.EditText


object Helper {
    //return function from edittext to String
   fun hitung(panjang: EditText, lebar: EditText): String {
       val p = panjang.text.toString()
       val l = lebar.text.toString()
       val hitung = p.toInt() * l.toInt()
       return hitung.toString()
   }
}