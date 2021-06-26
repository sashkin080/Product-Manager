package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book(1, "Гарри Поттер", 1000, "Джоан Роулинг");


    @Test
    void shouldTrue() {
        assertEquals(true, book.matches("Гарри"));
    }

    @Test
    void shouldFalse() {
        assertEquals(false, book.matches("Пушкин"));
    }

}