package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Cinema;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CinemaManagerTest {
    CinemaManager manager = new CinemaManager();
    Cinema one = new Cinema("Бладшот", 1, "");
    Cinema two = new Cinema("Вперед", 2, "мультфильм");
    Cinema three = new Cinema("Отель Белград", 3, "комедия");
    Cinema four = new Cinema("Джентельмены", 4, "боевик");
    Cinema five = new Cinema("Человек невидимка", 5, "ужасы");
    Cinema six = new Cinema("Тролли.Мировой тур", 6, "мультфильм");
    Cinema seven = new Cinema("Номер один", 7, "коммедия");
    Cinema eight = new Cinema("Друзья", 8, "коммедия");
    Cinema nine = new Cinema("Звонок", 9, "ужасы");
    Cinema ten = new Cinema("Дневник памяти", 10, "драма");

    @BeforeEach
    public void setUp() {
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
    }

    @Test
    public void sholdAdd() {

        Cinema[] expected = new Cinema[]{ten, nine, eight, seven, six, five, four, three, two, one};
        Cinema[] actual = manager.getAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmFromArray() {
        CinemaManager manager = new CinemaManager();
        manager.add(five);
        Cinema[] actual = manager.getMovie();
        Cinema[] expected = new Cinema[]{five};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmIfArraySizeZero() {
        CinemaManager manager = new CinemaManager(0);
        manager.add(one);
        Cinema[] actual = manager.getMovie();
        Cinema[] expected = new Cinema[]{};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void getIfNotFilm() {
        CinemaManager manager = new CinemaManager();

        Cinema[] actual = manager.getAll();
        Cinema[] expected = new Cinema[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastFiveCinema() {
        CinemaManager manager = new CinemaManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);

        Cinema[] actual = manager.getMovie();
        Cinema[] expected = new Cinema[]{five, four, three, two, one};

        assertArrayEquals(actual, expected);

    }

    @Test
    public void getMoreCinema() {
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);

        Cinema[] actual = manager.getMovie();
        Cinema[] expected = new Cinema[]{ten, nine, eight, seven, six, five, four, three, two, one};

        assertArrayEquals(actual, expected);
    }
}


