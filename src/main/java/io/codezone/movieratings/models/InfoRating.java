package io.codezone.movieratings.models;

public class InfoRating {
    String movieName;
    int rating;

    public InfoRating() {
    }

    public InfoRating(String mName, int r) {
        this.movieName = mName;
        this.rating = r;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public void setMovieName(String mName) {
        this.movieName = mName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
