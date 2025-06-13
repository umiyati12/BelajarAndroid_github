package com.namakelompok.belajarandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBiodata = findViewById<Button>(R.id.btn_biodata)
        val btnPendidikan = findViewById<Button>(R.id.btn_pendidikan)
        val btnAktivitas = findViewById<Button>(R.id.btn_aktivitas)

        btnBiodata.setOnClickListener {
            val intent = Intent(this, BiodataActivity::class.java)
            startActivity(intent)
        }

        btnPendidikan.setOnClickListener {
            val intent = Intent(this, PendidikanActivity::class.java)
            startActivity(intent)
        }

        btnAktivitas.setOnClickListener {
            val intent = Intent(this, AktivitasActivity::class.java)
            startActivity(intent)
        }
    }
}
