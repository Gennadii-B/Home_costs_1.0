package ru.home_costs;

import ru.home_costs.general.entity.Order;
import ru.home_costs.general.utilites.*;

import static ru.home_costs.general.tools.SOP.println;

public class Main {

    public static void main(String[] args) throws Exception {
        int answer;

        Reader reader = Reader.getInstance();
        Dialog dialog = Dialog.getInstance();
        Order order;
        OrderCreator orderCreator = OrderCreator.getInstance();
        OrderReader orderReader = OrderReader.getInstance();

        println(dialog.messegeController(9));
        println(dialog.messegeController(10));

        while(true) {
            answer = reader.answerNumber();
            println(dialog.messegeController(answer));
            order = orderCreator.controller(answer);
            orderReader.orderReader(answer, order);
            println("done");
            }
        }

}