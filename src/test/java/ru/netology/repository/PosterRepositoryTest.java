package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;
import ru.netology.manager.MovieManager;


import static org.junit.jupiter.api.Assertions.*;

class PosterRepositoryTest {
    PosterRepository posterRepository = new PosterRepository();

    MovieItem first = new MovieItem(1, "first", "film1", "detective");
    MovieItem second = new MovieItem(2, "second", "film2", "horror");
    MovieItem three = new MovieItem(3, "third", "film3", "drama");

    @Test
    void save() {
        posterRepository.save(second);
        assertArrayEquals(new MovieItem[]{second}, posterRepository.findAll());
    }

   @Test
   void findById() {
       posterRepository.save(second);
       posterRepository.save(first);
       posterRepository.save(three);

       assertEquals(first, posterRepository.findById(1));
   }

    @Test
    void removeById() {
        posterRepository.save(second);
        posterRepository.save(first);
        posterRepository.save(three);

        posterRepository.removeById(1);

        assertArrayEquals(new MovieItem[]{second,three}, posterRepository.removeById(1));
    }

    @Test
    void removeAll() {
        posterRepository.save(second);
        posterRepository.save(first);
        posterRepository.save(three);

        posterRepository.removeAll();

        assertArrayEquals(new MovieItem[]{} , posterRepository.removeAll());
    }
}