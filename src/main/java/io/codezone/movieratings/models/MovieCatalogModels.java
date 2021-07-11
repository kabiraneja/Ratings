package io.codezone.movieratings.models;

public class MovieCatalogModels {
    String name;
    String desc;
    int rating;

    public MovieCatalogModels() {}

    public MovieCatalogModels(String name, String desc, int rating) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String d) {
        this.desc = d;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int r) {
        this.rating = r;
    }
}
