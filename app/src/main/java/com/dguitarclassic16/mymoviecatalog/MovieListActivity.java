package com.dguitarclassic16.mymoviecatalog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MovieListActivity extends AppCompatActivity {

    private RecyclerView rvMovie;
    private ArrayList<Movie> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        rvMovie = findViewById(R.id.rv_Movie);
        rvMovie.setHasFixedSize(true);

        list.addAll(MovieData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvMovie.setLayoutManager(new LinearLayoutManager(this));
        MovieListAdapter movieListAdapter = new MovieListAdapter(list);
        rvMovie.setAdapter(movieListAdapter);

        movieListAdapter.setOnItemClickCallback(new MovieListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Movie movie) {
                Intent moveIntent = new Intent(MovieListActivity.this, MovieDetailActivity.class);
                moveIntent.putExtra(MovieDetailActivity.ITEM_EXTRA, movie);
                startActivity(moveIntent);
            }
        });
    }
}