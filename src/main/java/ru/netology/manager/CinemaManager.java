package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.Cinema;


import java.util.concurrent.Callable;

import static java.util.Objects.nonNull;

@NoArgsConstructor
public class CinemaManager {
    private Cinema[] films = new Cinema[0];
    int filmsLimit = 10;

    public CinemaManager(int filmsQuantity) {
        this.filmsLimit = filmsQuantity;
    }

    public void add(Cinema film) {
        int length = films.length + 1;
        Cinema[] tmp = new Cinema[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(films, 0, tmp, 0, films.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;

    }

    public Cinema[] getAll() {
        Cinema[] result = new Cinema[films.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = films.length - 1 - i;
            result[i] = films[index];
        }
        return result;
    }


    public Cinema[] getMovie() {
        int count = filmsLimit;
        if (films.length < count) {
            count = films.length;
        }
        Cinema[] result = new Cinema[count];
        for (int i = 0; i < result.length; i++) {
            int index = count - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
