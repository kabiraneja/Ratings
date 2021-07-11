package io.codezone.movieratings.models;

public class MovieRatingModel {
    int MovieId;
    int rating;

    public MovieRatingModel(int MId, int r) {
        this.MovieId = MId;
        this.rating = r;
    }

    public int getMovieId() { return MovieId; }

    public void setMovieId(int MovieRating) {
        this.MovieId = MovieRating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int r) {
        this.rating = r;
    }
}
