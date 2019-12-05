package com.training;

import com.training.client.MovieService;
import com.training.client.MovieServiceImplService;

public class Application {
    public static void main(String[] args) {
        MovieServiceImplService movieServiceImplService=new MovieServiceImplService();
        MovieService proxy=movieServiceImplService.getMovieServiceImplPort();
        double rating=proxy.getRating("Dabang3");
        System.out.println("Rating is: "+rating);
    }
}
