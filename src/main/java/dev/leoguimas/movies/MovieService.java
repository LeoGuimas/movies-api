package dev.leoguimas.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Movie findById(ObjectId id){
        return movieRepository.findById(id).orElse(null);
    }

    public Movie findByImdbId(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId).orElse(null);
    }
}
