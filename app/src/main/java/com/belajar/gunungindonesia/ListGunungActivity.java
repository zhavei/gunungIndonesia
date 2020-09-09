package com.belajar.gunungindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListGunungActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_list_gunung);

        //icon person ke hal about
        ImageView personIcon = findViewById(R.id.iv_icon_person);
        personIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAboutActivity();
            }
        });

        // ambil data list gunung
        List<Gunung> gunungList = MockData.getGunungList();


        // menampilkan list gunung
        RecyclerView rvGunungList = findViewById(R.id.rv_gunung_list);
        rvGunungList.setLayoutManager(new LinearLayoutManager(this.getApplicationContext()));
        rvGunungList.setAdapter(new GunungListAdapter(gunungList));
    }


    private void goToAboutActivity() {
        Intent intent = new Intent(this.getApplicationContext(), AboutActivity.class);
        startActivity(intent);
    }

}