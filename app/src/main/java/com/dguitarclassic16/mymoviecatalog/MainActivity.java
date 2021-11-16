package com.dguitarclassic16.mymoviecatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAbout = (Button)findViewById(R.id.button_about);
        btnAbout.setOnClickListener(view -> {
            Intent aboutIntent =new Intent(MainActivity.this, AboutActivity.class);
            startActivity(aboutIntent);
        });
        Button buttonLang = (Button) findViewById(R.id.button_lang);
        buttonLang.setOnClickListener(v-> {
            Intent intentLang = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(intentLang);
        });
        Button buttonMvList = (Button) findViewById(R.id.button_mvlist);
        buttonMvList.setOnClickListener(v-> {
            Intent intentMvList = new Intent(MainActivity.this, MovieListActivity.class);
            startActivity(intentMvList);
        });
    }
}