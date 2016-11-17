package ru.home_costs.general.utilites;

import ru.home_costs.general.entity.Order;

/**
 * это класс прослойка между полученным от пользователя запросом
 * и созданием ордера для последующей обработки его CRUD классом (Control)
 */
public class OrderCreator {
    private static OrderCreator ourInstance = new OrderCreator();

    public static OrderCreator getInstance() {
        return ourInstance;
    }

    private OrderCreator() {
    }

    Order order = new Order();
    Reader reader = Reader.getInstance();

    public Order controller(int i) throws Exception{
        if(i == 1){
            reader.newCostReader(order);
            return order;
        }if(i == 2){
            return order;
        }
        if(i == 3){
            reader.editNameReader(order);
            return order;
        }
        if(i == 4){
            reader.editTypeReader(order);
            return order;
        }
        if(i == 5){
            reader.showCostReader(order);
            return order;
        }
        if(i == 6){
            reader.showDateReader(order);
            return order;
        }
        if(i == 7){
            reader.showTypeReader(order);
            return order;
        }
        if(i == 8){
            reader.deleteCostReader(order);
            return order;
        }

        return order;
    }
}
