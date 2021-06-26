package ru.netology.repository;


import ru.netology.domain.MovieItem;


public class PosterRepository {
    private MovieItem[] movies = new MovieItem[0];
    private MovieItem[] items;
    private MovieItem[] tmp;
    private int id;


    public MovieItem[] findAll() {
        return movies;
    }

    public void save(MovieItem item) {
        MovieItem[] tmp = new MovieItem[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = item;
        movies = tmp;
    }


    public Object[] removeAll() {
        movies = new MovieItem[0];
        return new Object[0];
    }


    public MovieItem findById(int id) {
        MovieItem[] tmp = new MovieItem[1];
        for (MovieItem item : movies) {
            if (item.getId() == id) {
                tmp[0] = item;
                break;
            } else {
                tmp[0] = null;
            }
        }
        return tmp[0];
    }

    public Object[] removeById(int id) {
        MovieItem[] tmp = new MovieItem[movies.length - 1];
        int index = 0;
        for (MovieItem item : movies) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }

        }
        movies = tmp;
        return new Object[0];
    }
}