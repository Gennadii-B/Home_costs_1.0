package ru.home_costs.general.utilites;


import ru.home_costs.general.entity.Order;
import ru.home_costs.general.entity.Type;
import ru.home_costs.general.tools.MyException;

import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 * класс принимающий информацию от пользователя и меняющий поля
 * Order для нужного запроса
 * так же возвращет int для первого(главного) меню
 */
public class Reader {
    private static Reader ourInstance = new Reader();

    public static Reader getInstance() {
        return ourInstance;
    }

    private Reader() {
    }

    Control control = Control.getInstance();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
// метод возвращает int для главного меню
    public int answerNumber() throws Exception {
        int answerNumber = Integer.parseInt(reader.readLine());

        return answerNumber;
        }

    public void newCostReader(Order order) throws Exception{
        int t = Integer.parseInt(reader.readLine());

        if(t == 1)order.setType(Type.FOOD);
        else if(t == 2)order.setType(Type.RENT);
        else if(t == 3)order.setType(Type.FUN);
        else if(t == 4)order.setType(Type.CAR);
        order.setName(reader.readLine());
        order.setPrice(Integer.parseInt(reader.readLine()));
    }

    public void editNameReader(Order order)throws Exception{
        order.setIndex(Integer.parseInt(reader.readLine()));
        order.setName(reader.readLine());

    }

    public void editTypeReader(Order order)throws Exception{
        int t = Integer.parseInt(reader.readLine());
        int id = Integer.parseInt(reader.readLine());

        if(t == 1)order.setType(Type.FOOD);
        else if(t == 2)order.setType(Type.RENT);
        else if(t == 3)order.setType(Type.FUN);
        else if(t == 4)order.setType(Type.CAR);

    }

    public void showCostReader(Order order)throws Exception{
        order.setIndex(Integer.parseInt(reader.readLine()));

    }

    public void showDateReader(Order order)throws Exception{
        int y = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        order.setLocalDate(y, m, d);


    }

    public void showTypeReader(Order order) throws Exception{
        int t = Integer.parseInt(reader.readLine());

        if(t == 1)order.setType(Type.FOOD);
        else if(t == 2)order.setType(Type.RENT);
        else if(t == 3)order.setType(Type.FUN);
        else if(t == 4)order.setType(Type.CAR);
    }

    public void deleteCostReader(Order order) throws Exception{
        order.setIndex(Integer.parseInt(reader.readLine()));

    }
}

