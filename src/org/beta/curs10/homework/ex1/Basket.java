package org.beta.curs10.homework.ex1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<String> fruits = new ArrayList<>();

    public Basket(List<String> fruits) {
        this.fruits.addAll(fruits);
    }

    public List<String> getFruits() {
        return fruits;
    }

    public boolean find(String fruit) {
        if (fruit == null || fruit.isBlank()) {
            return false;
        }
        return fruits.contains(fruit);
    }
}
