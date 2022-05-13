package ru.netology.domian;

public class Book extends Product {
    protected String author;
    protected int pages;
    //Конструкторы при наследованиях.Они не наследуются

    public Book(int id, String title,String author,int pages){
        super(id, title);

        this.author = author;
        this.pages = pages;
    }


    @Override
    public  int weight() { //продублироали метод вывода на экран веса тов.
        return 2 * pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

