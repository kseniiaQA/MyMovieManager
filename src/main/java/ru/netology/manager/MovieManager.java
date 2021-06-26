package ru.netology.manager;

import ru.netology.domain.MovieItem;
import ru.netology.repository.PosterRepository;

public class MovieManager {
    PosterRepository repository;
    private MovieManager[] movies;

    public MovieManager(PosterRepository repository) {
        this.repository = this.repository;
    }


    public MovieManager() {

    }


    public void add(MovieItem movie) {
        repository.save(movie);
    } 

    public MovieItem[] getAll() {
        MovieItem[] items = repository.findAll();
        MovieItem[] result = new MovieItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
 
    public void removeById(int id) {
        repository.removeById(id);
    }

    public MovieManager[] findAll() {
        return movies;
    }
}
