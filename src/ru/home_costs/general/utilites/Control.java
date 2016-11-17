package ru.home_costs.general.utilites;

import ru.home_costs.general.entity.Cost;
import ru.home_costs.general.entity.Type;

import java.time.LocalDate;

/**
 * класс реализуюзий CRUD
 *
 */
public class Control {
    private static Control ourInstance = new Control();

    public static Control getInstance(){
        return ourInstance;
    }

    private Control(){}

    static DataBase dataBase = DataBase.getInstance();
// создание записи
    public void newCost(Type type, String name, int price){
        dataBase.getDatabase().add(new Cost(type, name, price));
    }
//показать запись по индексу
    public void showCost(int id){
        Cost cost = dataBase.getDatabase().get(id);
            System.out.println(cost.getId() + ". " + cost.getName() + " --- [" + cost.getPrice() + " rub.] --- " +
                    cost.getType() + " --- " + cost.getDateAdded());

    }
//по типу
    public void showType(Type type){
        int summ = 0;
        for(Cost cost: dataBase.getDatabase()){
            if(type == cost.getType()) {
                summ += cost.getPrice();
                System.out.println(cost.getId() + ". " + cost.getName() + " --- [" + cost.getPrice() + " rub.] --- " +
                        cost.getType() + " --- " + cost.getDateAdded());
            }
        }
        System.out.println("общая сумма = [" + summ + " rub.]");
    }
//показать все записи
    public void showAllCosts() {
        int summ = 0;
        for (Cost cost : dataBase.getDatabase()) {
            summ += cost.getPrice();
            System.out.println(cost.getId() + ". " + cost.getName() + " --- [" + cost.getPrice() + " rub.] --- " +
                    cost.getType() + " --- " + cost.getDateAdded());
        }
        System.out.println("общая сумма = [" + summ + " rub.]");
    }
// по дате
    public void showDate(LocalDate localDate){
        LocalDate localdate = localDate;
        for(Cost cost: dataBase.getDatabase()){
            if(localdate.equals(cost.getDateAdded()))
                System.out.println(cost.getId() + ". " + cost.getName() + " --- [" + cost.getPrice() + " rub.] --- " +
                        cost.getType() + " --- " + cost.getDateAdded());
        }
    }
//изменить тип записи
    public void editType(int id, Type type){
        for(Cost cost: dataBase.getDatabase())
        if(id == cost.getId()) {
            cost.setType(type);
            break;
        }
    }
//изменить имя
    public void editName(int id, String name){
        for(Cost cost: dataBase.getDatabase())
            if(id == cost.getId()) {
                cost.setName(name);
                break;
            }
    }
//удалить  запись по индексу
    public void deleteCost(int id){
        dataBase.getDatabase().remove(id);
        for(Cost cost: dataBase.getDatabase()){
            if(id < cost.getId()) cost.setId(cost.getId()-1);
        }
    }


}
