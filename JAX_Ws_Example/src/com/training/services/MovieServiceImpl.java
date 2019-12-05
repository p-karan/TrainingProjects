package com.training.services;

import com.training.beans.Director;
import com.training.ifaces.MovieService;

import javax.jws.WebService;

@WebService(endpointInterface = "com.training.ifaces.MovieService")
public class MovieServiceImpl implements MovieService {
    @Override
    public double getRating(String movieName) {
        double rating=3.2;

        if(movieName.equals("Dabang3")){
            rating=4.2;
        }
        return rating;
    }

    @Override
    public Director getTopDirector(String movieType) {
        Director topDirector=new Director("Bhansali",98765,"Hindi");

        if(movieType.equals("bhojpuri")){
            topDirector=new Director("sharma",647467,"Bhojpuri");
        }



        return topDirector;
    }

    public MovieServiceImpl() {
    }
}
