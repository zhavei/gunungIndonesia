package com.belajar.gunungindonesia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListGunungActivity extends AppCompatActivity {

    // ambil data list gunung
    private List<Gunung> gunungList = MockData.getGunungList();
    private List<Gunung> gunungListDisplay = new ArrayList<>();
    private GunungListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_list_gunung);

        gunungListDisplay.addAll(gunungList);

        //editext search
        EditText etSearch = findViewById(R.id.et_search_gununglist);
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //not Use
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //not use
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String searchKey = editable.toString();

                gunungListDisplay.clear();
                for (Gunung gunung : gunungList) {
                    String namaGunung = gunung.getNamaGunung().toLowerCase();
                    if (namaGunung.contains(searchKey.toLowerCase())) {
                        gunungListDisplay.add(gunung);
                    }
                }
                adapter.notifyDataSetChanged();
            }
        });

        //icon person ke hal about
        ImageView personIcon = findViewById(R.id.iv_icon_person);
        personIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAboutActivity();
            }
        });

        // menampilkan list gunung
        RecyclerView rvGunungList = findViewById(R.id.rv_gunung_list);
        rvGunungList.setLayoutManager(new LinearLayoutManager(this.getApplicationContext()));
        adapter = new GunungListAdapter(gunungListDisplay);
        rvGunungList.setAdapter(adapter);
    }


    private void goToAboutActivity() {
        Intent intent = new Intent(this.getApplicationContext(), AboutActivity.class);
        startActivity(intent);
    }

    // box dialog pergi
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Gunung Indonesia")
                .setMessage("beneran mau pergi?")
                .setPositiveButton("iya", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("engga", null)
                .show();
    }

}