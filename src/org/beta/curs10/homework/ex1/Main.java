package org.beta.curs10.homework.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> someFruits = new ArrayList<>();
        someFruits.add("apple");
        someFruits.add("banana");
        someFruits.add("orange");

        Basket basket = new Basket(someFruits);
        System.out.println(basket.getFruits());

        someFruits.add("BROCOLIIIIII");
        someFruits.add(null);

        System.out.println(basket.getFruits());
        System.out.println(basket.find("apple"));
    }
}
