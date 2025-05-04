package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TugasActivity extends AppCompatActivity {

    private ImageButton btnBack, btnCheck, btnTrash, btnCamera, btnEdit, btnMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas); // Ganti sesuai nama XML kamu

        // Hubungkan id tombol
        btnBack = findViewById(R.id.btnBack);
        btnCheck = findViewById(R.id.btnCheck);
        btnTrash = findViewById(R.id.btnTrash);
        btnCamera = findViewById(R.id.btnCamera);
        btnEdit = findViewById(R.id.btnEdit);
        btnMore = findViewById(R.id.btnMore);

        // Event tombol
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Kembali ke halaman sebelumnya
                finish();
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Simpan atau selesai
                Toast.makeText(TugasActivity.this, "Daftar belanja disimpan!", Toast.LENGTH_SHORT).show();
                // Bisa tambah: finish();
            }
        });

        btnTrash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aksi hapus daftar
                Toast.makeText(TugasActivity.this, "Daftar belanja dihapus!", Toast.LENGTH_SHORT).show();
            }
        });

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Buka kamera
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(cameraIntent);
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aksi edit
                Toast.makeText(TugasActivity.this, "Mode edit diaktifkan", Toast.LENGTH_SHORT).show();
            }
        });

        btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tampilkan menu tambahan
                Toast.makeText(TugasActivity.this, "Fitur lainnya", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
