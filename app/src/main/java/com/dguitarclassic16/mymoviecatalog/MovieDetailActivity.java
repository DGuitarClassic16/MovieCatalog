package com.dguitarclassic16.mymoviecatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MovieDetailActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        ImageView cover = findViewById(R.id.img_cover);
        TextView title = findViewById(R.id.tv_title);
        TextView voteAverage = findViewById(R.id.tv_voteaverage);
        TextView releaseDate = findViewById(R.id.tv_releasedate);
        TextView popularity = findViewById(R.id.tv_popularity);
        TextView overview = findViewById(R.id.tv_overview);

        Movie movie = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(movie != null) {
            Glide.with(this).load(movie.getMv_cover()).into(cover);
            title.setText(movie.getMv_title());
            voteAverage.setText(movie.getMv_voteaverage());
            releaseDate.setText(movie.getMv_releasedate());
            popularity.setText(movie.getMv_popularity());
            overview.setText(movie.getMv_overview());
        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Movie Detail");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}