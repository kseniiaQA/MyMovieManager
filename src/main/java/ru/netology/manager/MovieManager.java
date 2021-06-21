package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {


    private int count = 10;
    private MovieManager[] items = new MovieManager[0];


    public MovieManager() {

    }

    public MovieManager(int i2, int i1, String first, int i, int count) {
        this.count = count;
    }

    public MovieManager(int i, String first, String film1, String detective) {
    }


    public void add(MovieManager item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        MovieManager[] tmp = new MovieManager[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieManager[] getAll() {

        int newLength;
        if (items.length < count) {
            newLength = items.length;
        } else {
            newLength = count;
        }
        MovieManager[] result = new MovieManager[newLength];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < newLength; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;
    }

    public void getId() {
    }

}