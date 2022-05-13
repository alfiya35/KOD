package ru.netology.manager;

import ru.netology.domian.Product;

public class ProductManager { //этот клас будет хранить товары.Можем хранить любые товары, в массиве.
    private Product[] products = new Product[0];

    public void add(Product product) { //метод добавления.Сюда можно добавлять и футболку и книгу.Потому что все подойдет под
        //описание ячейки Product.Вэтом суть полиморфизма-вы можете пол.объект одного знач-я в ячейку другого зн-я

        Product[] tmp = new Product[products.length + 1];//создаем новый массив
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;//заполнение последней ячейки
        products = tmp;
    }
    public Product[] lessWeightThan(int weight) { //метод возврата товаров нетяжелее чем заданный вес
        //Возврвщвть он будет массив продуктов
        Product[] ans = new Product[0]; //создадим массив для ответа,сперва он пустой.Туда будем складывать
//ответ, потом ты мне его отдашь.
        for (Product product : products) {//перебираем свои продукты. Номер продукта нам не нужен,нуэен сам продукт
            if (product.weight()< weight){//если пр.с весом м. чем тот который меня попросили, то тогда его надо доб в ответ.
                Product[] tmp = new Product[ans.length+1];//создаем новый массив на 1ячейку больше
                for (int i = 0; i < tmp.length; i++) {
                    tmp[i] = ans[i];
                }
                tmp[tmp.length-1] = product;
                ans = tmp;
            }
        }
        return  ans;
    }
}
