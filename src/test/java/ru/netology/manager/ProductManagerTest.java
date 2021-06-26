package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    private ProductManager manager = new ProductManager();
    private Book item1 = new ru.netology.domain.Book(1,"Гарри Поттер и философский камень", 1000, "Джоан Роулинг");
    private Book item2 = new ru.netology.domain.Book(2,"Гарри Поттер и тайная комната", 1500, " Джоан Роулинг");
    private Book item3 = new Book(3,"Гарри Поттер и узник Азкабана", 2000, "Джоан Роулинг");
    private Book item4 = new Book(4, "Война и Мир", 1200, "Лев Толстой" );
    private Smartphone item5 = new Smartphone(5,"A50", 20000,"Samsung" );
    private Smartphone item6 = new Smartphone(6,"A51", 22000, "Samsung" );
    private Smartphone item7 = new Smartphone(7, "A52", 25000, "Samsung");
    private Smartphone item8 = new Smartphone(8, "12 Pro Max", 120000, "Apple" );



    @Test
    public void shouldFindEmptyBook () {
        Product[] actual= manager.searchBy("Джоан Роулинг");
        Product[] expected = new Product[]{};
        assertArrayEquals(actual,expected);
    }

    @Test
    public void shouldFindEmptySmartphone () {
        Product[] actual = manager.searchBy("Samsung");
        Product[] expected = new Product[]{};
        assertArrayEquals(actual,expected);
    }
}