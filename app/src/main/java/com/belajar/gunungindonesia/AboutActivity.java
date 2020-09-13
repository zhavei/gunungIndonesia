package com.belajar.gunungindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_about);

        //icon back ke hal list
       ImageView arrowBack = findViewById(R.id.iv_arrow_back);
       arrowBack.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               goToListGunungMain();
           }
       });

    }

    private void goToListGunungMain() {
        Intent intent = new Intent(this.getApplicationContext(), ListGunungActivity.class);
        startActivity(intent);
        finish();
    }


}