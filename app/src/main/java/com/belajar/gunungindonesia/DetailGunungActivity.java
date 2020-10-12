package com.belajar.gunungindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailGunungActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_detail);

        String namaGunung = getIntent().getStringExtra("namaGunung");
        String imageurl = getIntent().getStringExtra("imageurl");
        String tinggiGunung = getIntent().getStringExtra("tinggiGunung");
        String deskripsiGunung = getIntent().getStringExtra("deskripsiGunung");


        ImageView ivGambar = findViewById(R.id.iv_gambar_gunung);
        TextView tvNamaGunung = findViewById(R.id.tv_nama_gunung);
        TextView tvTinggiGunung = findViewById(R.id.tv_tinggi_gunung);
        TextView tvDeskripsiGunung = findViewById(R.id.tv_deskripsi_gunung);

        tvNamaGunung.setText(namaGunung);
        tvTinggiGunung.setText(tinggiGunung);
        tvDeskripsiGunung.setText(deskripsiGunung);

        Glide.with(this.getApplicationContext())
                .load(imageurl)
                .into(ivGambar);


    }
}