package com.dguitarclassic16.mymoviecatalog;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private int mv_cover;
    private String mv_title;
    private String mv_voteaverage;
    private String mv_overview;
    private String mv_releasedate;
    private String mv_popularity;

    public Movie(){

    }
    protected Movie(Parcel in) {
        mv_cover = in.readInt();
        mv_title = in.readString();
        mv_voteaverage = in.readString();
        mv_overview = in.readString();
        mv_releasedate = in.readString();
        mv_popularity = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getMv_popularity() {
        return mv_popularity;
    }

    public void setMv_popularity(String mv_popularity) {
        this.mv_popularity = mv_popularity;
    }

    public String getMv_releasedate() {
        return mv_releasedate;
    }

    public void setMv_releasedate(String mv_releasedate) {
        this.mv_releasedate = mv_releasedate;
    }

    public int getMv_cover() {
        return mv_cover;
    }

    public void setMv_cover(int mv_cover) {
        this.mv_cover = mv_cover;
    }

    public String getMv_title() {
        return mv_title;
    }

    public void setMv_title(String mv_title) {
        this.mv_title = mv_title;
    }

    public String getMv_voteaverage() {
        return mv_voteaverage;
    }

    public void setMv_voteaverage(String mv_voteaverage) {
        this.mv_voteaverage = mv_voteaverage;
    }

    public String getMv_overview() {
        return mv_overview;
    }

    public void setMv_overview(String mv_overview) {
        this.mv_overview = mv_overview;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mv_cover);
        dest.writeString(mv_title);
        dest.writeString(mv_voteaverage);
        dest.writeString(mv_overview);
        dest.writeString(mv_releasedate);
        dest.writeString(mv_popularity);
    }
}
