package com.example.todolist;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvSkincare, tvTugas, tvBelanja;
    private CheckBox cbSayuran, cbBuah, cbPakaian, cbMakanan, cbMinuman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ganti sesuai nama layout kamu

        // Hubungkan id dari XML
        tvSkincare = findViewById(R.id.tvSkincare);
        tvTugas = findViewById(R.id.tvTugas);
        tvBelanja = findViewById(R.id.tvBelanja);

        cbSayuran = findViewById(R.id.cbSayuran);
        cbBuah = findViewById(R.id.cbBuah);
        cbPakaian = findViewById(R.id.cbPakaian);
        cbMakanan = findViewById(R.id.cbMakanan);
        cbMinuman = findViewById(R.id.cbMinuman);

        // Set klik listener
        tvSkincare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent skincareIntent = new Intent(MainActivity.this, SkincareActivity.class);
                startActivity(skincareIntent);
            }
        });

        tvTugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tugasIntent = new Intent(MainActivity.this, TugasActivity.class);
                startActivity(tugasIntent);
            }
        });

        tvBelanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent belanjaIntent = new Intent(MainActivity.this, BelanjaActivity.class);
                startActivity(belanjaIntent);
            }
        });


    }
}
