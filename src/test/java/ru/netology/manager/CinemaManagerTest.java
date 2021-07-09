package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Cinema;

import static org.junit.jupiter.api.Assertions.*;

public class CinemaManagerTest {
    CinemaManager manager = new CinemaManager(10);

    @Test
    public void shouldAdd() {
        Cinema one = new Cinema("Бладшот", 1, "боевик");
        Cinema two = new Cinema("Вперед", 2, "мультфильм");
        Cinema three = new Cinema("Отель Белград", 3, "комедия");
        Cinema four = new Cinema("Джентельмены", 4, "боевик");
        Cinema five = new Cinema("Человек невидимка", 5, "ужасы");

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);

        Cinema[] actual = manager.getCinema();
        Cinema[] expected = new Cinema[]{five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoreTenCinema() {
        Cinema one = new Cinema("Бладшот", 1, "боевик");
        Cinema two = new Cinema("Вперед", 2, "мультфильм");
        Cinema three = new Cinema("Отель Белград", 3, "комедия");
        Cinema four = new Cinema("Джентельмены", 4, "боевик");
        Cinema five = new Cinema("Человек невидимка", 5, "ужасы");
        Cinema six = new Cinema("Тролли.Мировой тур", 6, "мультфильм");
        Cinema seven = new Cinema("Номер один", 7, "коммедия");
        Cinema eight = new Cinema("Друзья", 8, "коммедия");
        Cinema nine = new Cinema("Звонок", 9, "ужасы");
        Cinema ten = new Cinema("Дневник памяти", 10, "драма");
        Cinema eleven = new Cinema("Король лев", 11, "мультик");
        Cinema twelve = new Cinema("Золушка", 12, "мультик");

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
        manager.add(eleven);
        manager.add(twelve);

        Cinema[] actual = manager.getCinema();
        Cinema[] expected = new Cinema[]{twelve, eleven, ten, nine, eight, seven, six, five, four, three};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmIfArraySizeZero() {
        Cinema[] actual = manager.getCinema();
        Cinema[] expected = new Cinema[]{};

        assertArrayEquals(expected, actual);
    }
}