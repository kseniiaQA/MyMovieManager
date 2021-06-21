package ru.netology.manager;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
    private MovieManager manager = new MovieManager();
    private MovieManager first = new MovieManager(1, 1, "first", 1, 1);
    private MovieManager second = new MovieManager(2, 2, "second", 1, 1);
    private MovieManager three = new MovieManager(3, 3, "third", 1, 1);
    private MovieManager fourth;
    private MovieManager fifth;
    private MovieManager sixth;
    private MovieManager seventh;
    private MovieManager eight;
    private MovieManager ninth;
    private MovieManager tenth;


    @Test
    void addAtEmpty() {
        manager.add(first);

        assertArrayEquals(new MovieManager[]{first}, manager.getAll());
//
    }

    @Test
    void addTwoElement() {

        manager.add(first);
        manager.add(second);

        assertArrayEquals(new MovieManager[]{second, first}, manager.getAll());
    }

    @Test
    void addThreeElements() {
        manager.add(first);
        manager.add(second);
        manager.add(three);

        assertArrayEquals(new MovieManager[]{three, second, first}, manager.getAll());

    }

    @Test
    void getTenMovies() {
        manager.add(first);
        manager.add(second);
        manager.add(three);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(ninth);
        manager.add(tenth);

        assertArrayEquals(new MovieManager[]{tenth, ninth, eight, seventh, sixth, fifth, fourth, three, second, first}, manager.getAll());

    }

    @Test
    void getMovies() {
        manager.add(first);
        manager.add(second);
        manager.add(three);

        assertArrayEquals(new MovieManager[]{three, second, first}, manager.getAll());

    }
}