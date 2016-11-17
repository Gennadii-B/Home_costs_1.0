package ru.home_costs.general.utilites;

import ru.home_costs.general.entity.Cost;

import java.util.ArrayList;

/**
 * Created by N on 16.11.2016.
 */
public class DataBase {
    private static DataBase ourInstance = new DataBase();

    public static DataBase getInstance() {
        return ourInstance;
    }

    private DataBase() {
    }

    private ArrayList<Cost> database = new ArrayList<>();

    ArrayList<Cost> getDatabase() {
        return database;
    }
}
