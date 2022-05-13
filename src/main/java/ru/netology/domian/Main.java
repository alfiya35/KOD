package ru.netology.domian;

public class Main {
    //НАСЛЕДОВАНИЕ
//        public static void main(String[]args){  //Класс товара
//        Product p1 = new Product(1,"Варежка");
//        Product p2 = new Product(1, "Варежка");
//
//
//        System.out.println(p1.equals(p2));

    //        Book book = new Book(1,"My Life","2Pac",150);
//        book.setPages(150);
//        System.out.println(book.weight());
////        TShirt shirt = new  TShirt();
//    }
//}
//ПОЛИМОРФИЗМ(поли-много,формизм- форма)
    public static void main(String[] args) {
//        Product p = new Book(1, "My Life", "2Pac", 150);
//        //Положить в ячейку с типом вашего отца, объект вашего наследника
//        //Книжку кладу в ячейку для товаров
//        //"Product p"-тип объекта, с пременной "р"
//        System.out.println(p.weight());//достань предмет из коробки р и попроси
//    }//его выполнить команду weight
        //ГДЕ ИСПОЛЬЗУЕТСЯ ПОЛИМОРФИЗМ?
        Product[] products = {  //создаем массив, сотоящий из разных обьектов разного типа
                new Book(1, "My Life", "2Pac", 150),
                new TShirt(3, "Summer TShirt", 7),
                new Book(13, "Lord of the Java", "Netology", 700),
        };

        int sum = 0; //метод суммирования веса всех товаров в нашем массиве
        for (Product p : products) {
            sum += p.weight();
        }
    }
}