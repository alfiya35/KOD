package ru.netology.domian;

public class TShirt extends Product {
   protected int size;


    public TShirt(int id, String title,int size) {
        super(id, title);
        this.size = size;
    }

    @Override
    public int weight() {
        return size * 80;
    }
}
