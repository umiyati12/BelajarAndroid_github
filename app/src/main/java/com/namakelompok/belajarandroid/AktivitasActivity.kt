package com.namakelompok.belajarandroid

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class AktivitasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aktivitas)

        val spinnerNama = findViewById<Spinner>(R.id.spinner_nama)
        val textAktivitas = findViewById<TextView>(R.id.text_aktivitas)
        val btnKembali = findViewById<Button>(R.id.btn_kembali_aktivitas)

        val namaArray = arrayOf("Umiyati", "Muhammad Aulani", "Siti Khairunnisa Kamelia")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, namaArray)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerNama.adapter = adapter

        spinnerNama.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val aktivitas = when (position) {
                    0 -> getString(R.string.aktivitas_umiyati)
                    1 -> getString(R.string.aktivitas_aulani)
                    2 -> getString(R.string.aktivitas_siti)
                    else -> ""
                }
                textAktivitas.text = aktivitas
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                textAktivitas.text = ""
            }
        }

        btnKembali.setOnClickListener {
            finish()
        }
    }
}
