package io.codezone.movieratings.controller;

import io.codezone.movieratings.models.InfoRating;
import io.codezone.movieratings.models.MovieCatalogModels;
import io.codezone.movieratings.models.MovieRatingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/rate")
public class MovieRate {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/ratings")
    public List<MovieRatingModel> getRating() {
        List<MovieRatingModel> ratingList = new ArrayList<>();

        ratingList.add(findRating(1,4));
        ratingList.add(findRating(2,3));
        ratingList.add(findRating(3,5));
        return ratingList;
    }
    public MovieRatingModel findRating(int MId,int r) {
        MovieRatingModel object = new MovieRatingModel(MId,r);
        return object;
    }
    @GetMapping("/{movieName}")
    public InfoRating ratingMovie(@PathVariable("movieName") String movieName) {
        InfoRating rate1 = new InfoRating("Transformers",4);
        InfoRating rate2 = new InfoRating("Intersteller",3);
        InfoRating rate3 = new InfoRating("Dark knight",5);
        if(movieName.equals(rate1.getMovieName()))
            return rate1;
        if(movieName.equals(rate2.getMovieName()))
            return rate2;
        if(movieName.equals(rate3.getMovieName()))
            return rate3;
        return null;
    }
    @GetMapping("/singleRating/{movieName}")
    public int rateMovieObject(@PathVariable("movieName") String movieName) {
        InfoRating rate1 = new InfoRating("Transformers",4);
        InfoRating rate2 = new InfoRating("Intersteller",3);
        InfoRating rate3 = new InfoRating("Dark knight",5);
        if(movieName.equals(rate1.getMovieName()))
            return rate1.getRating();
        if(movieName.equals(rate2.getMovieName()))
            return rate2.getRating();
        if(movieName.equals(rate3.getMovieName()))
            return rate3.getRating();
        return -1;
    }
    @GetMapping("/FromISController/{mName}")
    public MovieCatalogModels getInfoServiceAndMCM_Data(@PathVariable("mName") String mName) {
        MovieCatalogModels obj = restTemplate.getForObject("http://movie-info-service/info/getsingleObject/"+mName,MovieCatalogModels.class);
        return obj;
    }
}
