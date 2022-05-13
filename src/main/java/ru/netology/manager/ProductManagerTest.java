package ru.netology.manager;

import ru.netology.domian.Book;
import ru.netology.domian.Product;
import ru.netology.domian.TShirt;

public class ProductManagerTest {
   @Test
    public void test(){//написать хорошее название,шуд файнд и тд
       TShirt shirt1 = new TShirt(3,"Summer TShirt",7);

       ProductManager manager = new ProductManager();

       manager.add(new Book(1, "My Life", "2Pac", 1500));
       manager.add(shirt1);
       manager.add(new Book(13, "Lord of the Java", "Netology", 7000));

       manager.lessWeightThan(1000);

       Product[] actual = manager.lessWeightThan(1000);
       Product[] expected = { shirt1 };

       Assertasser

   }
}
