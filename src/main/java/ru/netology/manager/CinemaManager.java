package ru.netology.manager;


import ru.netology.domain.Cinema;

public class CinemaManager {
    private Cinema[] films = new Cinema[0];
    private int returnFilms;

    public CinemaManager(int returnFilms) {

        this.returnFilms = returnFilms;
    }

    public Cinema[] getCinema() {
        int length = returnFilms;
        if (length > films.length) {
            length = films.length;
        }

        Cinema[] result = new Cinema[length];

        for (int i = 0; i < length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public void add(Cinema film) {
        int length = films.length + 1;
        Cinema[] tmp = new Cinema[length];

        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }
}