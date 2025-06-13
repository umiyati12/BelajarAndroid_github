package com.namakelompok.belajarandroid

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class PendidikanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pendidikan)

        val spinnerNama = findViewById<Spinner>(R.id.spinner_nama)
        val textPendidikan = findViewById<TextView>(R.id.text_pendidikan)
        val btnKembali = findViewById<Button>(R.id.btn_kembali_pendidikan)

        val namaArray = arrayOf("Umiyati", "Muhammad Aulani", "Siti Khairunnisa Kamelia")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, namaArray)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerNama.adapter = adapter

        spinnerNama.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val pendidikan = when (position) {
                    0 -> getString(R.string.pendidikan_umiyati)
                    1 -> getString(R.string.pendidikan_aulani)
                    2 -> getString(R.string.pendidikan_siti)
                    else -> ""
                }
                textPendidikan.text = pendidikan
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                textPendidikan.text = ""
            }
        }

        btnKembali.setOnClickListener {
            finish()
        }
    }
}
