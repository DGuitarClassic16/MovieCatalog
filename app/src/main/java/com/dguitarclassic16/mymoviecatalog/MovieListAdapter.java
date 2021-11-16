package com.dguitarclassic16.mymoviecatalog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.ListViewHolder> {
    private ArrayList<Movie> movieList;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }


    public MovieListAdapter(ArrayList<Movie> list) {
        this.movieList = list;
    }
    @NonNull
    @Override
    public MovieListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row_list,parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieListAdapter.ListViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        Glide.with(holder.itemView.getContext()).load(movie.getMv_cover())
                .apply(new RequestOptions().override(120,180))
                .into(holder.imgCover);
        holder.tvTitle.setText(movie.getMv_title());
        holder.tvVoteAverage.setText(movie.getMv_voteaverage());
        holder.tvOverview.setText(movie.getMv_overview());
        holder.tvReleaseDate.setText(movie.getMv_releasedate());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(movieList.get(holder.getBindingAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCover;
        TextView tvTitle, tvVoteAverage, tvOverview, tvReleaseDate;
        ListViewHolder(View movieview) {
            super(movieview);
            imgCover = movieview.findViewById(R.id.img_cover);
            tvTitle = movieview.findViewById(R.id.tv_title);
            tvVoteAverage = movieview.findViewById(R.id.tv_voteaverage);
            tvOverview = movieview.findViewById(R.id.tv_overview);
            tvReleaseDate = movieview.findViewById(R.id.tv_releasedate);

        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Movie movie);
    }
}
