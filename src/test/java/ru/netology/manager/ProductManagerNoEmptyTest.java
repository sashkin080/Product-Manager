package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerNoEmptyTest {

    private ProductManager manager = new ProductManager();
    private Book item1 = new Book(1,"Гарри Поттер и философский камень", 1000, "Джоан Роулинг");
    private Book item2 = new Book(2,"Гарри Поттер и тайная комната", 1500, " Джоан Роулинг");
    private Book item3 = new Book(3,"Гарри Поттер и узник Азкабана", 2000, "Джоан Роулинг");
    private Book item4 = new Book(4, "Война и Мир", 1200, "Лев Толстой" );
    private Smartphone item5 = new Smartphone(5,"A50", 20000,"Samsung" );
    private Smartphone item6 = new Smartphone(6,"A51", 22000, "Samsung" );
    private Smartphone item7 = new Smartphone(7, "A52", 25000, "Samsung");
    private Smartphone item8 = new Smartphone(8, "12 Pro Max", 120000, "Apple" );


    @BeforeEach
    public void set() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
    }


    @Test
    public void shouldFindTheAuthorOfTheBook() {
        Product[] actual = manager.searchBy("Лев Толстой");
        Product[] expected = new Product[]{item4};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindTheAuthorsOfTheBook() {
        Product[] actual = manager.searchBy("Джоан Роулинг");
        Product[] expected = new Product[]{item1, item2, item3};
        assertArrayEquals(actual, expected);
    }


    @Test
    public void shouldFindTheNameOfTheBook() {
        Product[] actual = manager.searchBy("Гарри Поттер и тайная комната");
        Product[] expected = new Product[]{item2};
        assertArrayEquals(actual,expected);
    }

    @Test
    public void shouldFindANonExistentBook() {
        Product[] actual = manager.searchBy("Муму");
        Product[] expected = new Product[]{};
        assertArrayEquals(actual,expected);
    }

    @Test
    public void shouldFindTheManufactureOfTheSmartphone() {
        Product[] actual = manager.searchBy("Apple");
        Product[] expected = new Product[]{item8};
        assertArrayEquals(actual,expected);
    }

    @Test
    public void shouldFindTheManufacturersOfTheSmartphone() {
        Product[] actual = manager.searchBy("Samsung");
        Product[] expected = new Product[]{item5,item6,item7};
        assertArrayEquals(actual,expected);
    }

    @Test
    public void shouldFindTheNameOfTheSmartphone() {
        Product[] actual = manager.searchBy("A51");
        Product[] expected = new Product[]{item6};
        assertArrayEquals(actual,expected);
    }

    @Test
    public void shouldFindANonExistentSmartphone() {
        Product[] actual = manager.searchBy("Honor");
        Product[] expected = new Product[]{};
    }





}

