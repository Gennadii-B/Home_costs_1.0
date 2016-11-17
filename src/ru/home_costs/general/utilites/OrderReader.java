package ru.home_costs.general.utilites;

import ru.home_costs.general.entity.Order;

/**
 * этот класс выбирает необходимое пользователю действие через класс CRUD (Control)
 */
public class OrderReader {
    private static OrderReader ourInstance = new OrderReader();

    public static OrderReader getInstance() {
        return ourInstance;
    }

    private OrderReader() {
    }
    Control control = Control.getInstance();

    public void orderReader(int answer, Order order){
        if(answer == 1) control.newCost(order.getType(), order.getName(), order.getPrice());
        if(answer == 2) control.showAllCosts();
        if(answer == 3) control.editName(order.getIndex(), order.getName());
        if(answer == 4) control.editType(order.getIndex(), order.getType());
        if(answer == 5) control.showCost(order.getIndex());
        if(answer == 6) control.showDate(order.getLocalDate());
        if(answer == 7) control.showType(order.getType());
        if(answer == 8) control.deleteCost(order.getIndex());

    }
}
