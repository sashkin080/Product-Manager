package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product(1, "Гарри Поттер", 1000);

    @Test
    void shouldTrue() {
        assertEquals(true, product.matches("Гарри"));
    }

    @Test
    void shouldFalse() {
        assertEquals(false, product.matches("Белоснежка"));
    }

}