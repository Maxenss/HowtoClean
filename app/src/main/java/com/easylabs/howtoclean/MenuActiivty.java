package com.easylabs.howtoclean;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MenuActiivty extends AppCompatActivity implements View.OnClickListener {
    RelativeLayout rlBlood;
    RelativeLayout rlFat;
    RelativeLayout rlSweat;
    RelativeLayout rlWine;
    RelativeLayout rlRust;
    RelativeLayout rlPaint;
    RelativeLayout rlFruit;
    RelativeLayout rlUnknown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_actiivty);

        setTitle("Выберите пятно");

        rlBlood = (RelativeLayout) findViewById(R.id.rlBlood);
        rlFat = (RelativeLayout) findViewById(R.id.rlFat);
        rlSweat = (RelativeLayout) findViewById(R.id.rlSweat);
        rlWine = (RelativeLayout) findViewById(R.id.rlWine);
        rlRust = (RelativeLayout) findViewById(R.id.rlRust);
        rlPaint = (RelativeLayout) findViewById(R.id.rlPaint);
        rlFruit = (RelativeLayout) findViewById(R.id.rlFruit);
        rlUnknown = (RelativeLayout) findViewById(R.id.rlUnknown);

        rlBlood.setOnClickListener(this);
        rlFat.setOnClickListener(this);
        rlSweat.setOnClickListener(this);
        rlWine.setOnClickListener(this);
        rlRust.setOnClickListener(this);
        rlPaint.setOnClickListener(this);
        rlFruit.setOnClickListener(this);
        rlUnknown.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int idView = view.getId();

        switch (idView){
            case R.id.rlBlood: Data.currentId = Data.BLOOD_ID; break;
            case R.id.rlFat: Data.currentId = Data.FAT_ID; break;
            case R.id.rlSweat: Data.currentId = Data.SWEAT_ID; break;
            case R.id.rlWine: Data.currentId = Data.WINE_ID; break;
            case R.id.rlRust: Data.currentId = Data.RUST_ID; break;
            case R.id.rlPaint: Data.currentId = Data.PAINT_ID; break;
            case R.id.rlFruit: Data.currentId = Data.FRUID_ID; break;
            case R.id.rlUnknown: Data.currentId = Data.UNKNOWN_ID; break;
        }

        // Создаём намерение на запуск нового Activity
        // this - это контекст данного окна, MenuActivity
        Intent intent = new Intent(this, ContentActivity.class);

        // Запуск нового Activity
        startActivity(intent);
    }
}
