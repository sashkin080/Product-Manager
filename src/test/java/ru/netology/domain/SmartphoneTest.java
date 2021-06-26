package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone smartphone = new Smartphone(1, "смартфон", 50000, "Samsung");


    @Test
    void shouldTrue() {
        assertEquals(true, smartphone.matches("смартфон"));
    }

    @Test
    void shouldFalse() {
        assertEquals(false, smartphone.matches("планшет"));
    }

}