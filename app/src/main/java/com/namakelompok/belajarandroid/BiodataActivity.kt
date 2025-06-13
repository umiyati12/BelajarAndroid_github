package com.namakelompok.belajarandroid

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class BiodataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val spinnerNama = findViewById<Spinner>(R.id.spinner_nama)
        val textBiodata = findViewById<TextView>(R.id.text_biodata)
        val btnKembali = findViewById<Button>(R.id.btn_kembali_biodata)

        val namaArray = arrayOf("Umiyati", "Muhammad Aulani", "Siti Khairunnisa Kamelia")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, namaArray)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerNama.adapter = adapter

        spinnerNama.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val biodata = when (position) {
                    0 -> getString(R.string.biodata_umiyati)
                    1 -> getString(R.string.biodata_aulani)
                    2 -> getString(R.string.biodata_siti)
                    else -> ""
                }
                textBiodata.text = biodata
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                textBiodata.text = ""
            }
        }

        btnKembali.setOnClickListener {
            finish()
        }
    }
}
