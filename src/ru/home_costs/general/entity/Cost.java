package ru.home_costs.general.entity;


import java.time.LocalDate;

/**
 * Created by N on 16.11.2016.
 */
public class Cost {
    private String name;
    private int id;
    private int price;
    private LocalDate dateAdded;
    private Type type;

    private static int idCosts = 0;

    public Cost(Type type, String name, int price) {
        this.type = type;
        this.name = name;
        this.id = idCosts++;
        this.price = price;
        dateAdded = dateAdded.now();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int getIdCosts() {
        return idCosts;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public Type getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(Type type) {
        this.type = type;
    }
}


