package ru.home_costs.general.entity;

import java.time.LocalDate;

/**
 * Created by N on 17.11.2016.
 */
public class Order {

    private Type type;
    private LocalDate localDate;
    private int index;
    private String name;
    private int price;

    public  void setLocalDate(int y, int m, int d){
        localDate = LocalDate.of(y, m, d);
    }

    public  Type getType() {
        return type;
    }

    public  void setType(Type type) {
        this.type = type;
    }

    public  int getIndex() {
        return index;
    }

    public  void setIndex(int index) {
        this.index = index;
    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public  LocalDate getLocalDate() {
        return localDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
