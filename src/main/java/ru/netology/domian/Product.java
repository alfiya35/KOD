package ru.netology.domian;

import java.util.Objects;

public class Product {   //класс описывающий один тавар
    //спец класс.Если никто не указан,вашим отцом, то это класс Object
    //Object-адам для всех классов Java

    protected int id;  //уникальныый номер
    protected String title;  //название

    public Product(int id, String title) { //Конструктор
        this.id = id;
        this.title = title;
    }

    public  int weight() { //метод вывода на экран сколько весит товар
        return  -1;
    }


    public int getId() { //Геттеры и сеттеры
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override //метод ИКЛС
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}