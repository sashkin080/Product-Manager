package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {

    private Product[] managers = new Product[0];

    public void save(Product manager) {
        int length = managers.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(managers, 0, tmp, 0, managers.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = manager;
        managers = tmp;
    }

    public Product[] findAll() {
        return managers;
    }

    public void removeById(int id) {
        int length = managers.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product manager : managers) {
            if (manager.getId() != id) {
                tmp[index] = manager;
                index++;
            }
        }
        managers = tmp;
    }
}
