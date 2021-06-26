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

    @Test
    public void shouldUseEquals() {
        Product first = new Product(1, "Муму", 999);
        Product second = new Product(1, "Муму", 999);
        assertEquals(first,second);
    }
}