package ru.home_costs.general.utilites;

/**
 * класс говорящий с пользователем
 * в его повидение это метод, отправляющий нужное пользователю
 * сообщение в зависимости от полученного аргумента.
 */
public class Dialog {
    private static Dialog ourInstance = new Dialog();

    public static Dialog getInstance() {
        return ourInstance;
    }

    private Dialog() {
    }

    String halloText = "Вас привеетствует домашняя бугалтерия \"Hallo costs 1.0\"";
    String generalText = "\nВыбирите действие из списка и введите его индекс: \n" +
            "1. Добавить запись. \n" +
            "2. Вывести все записи.\n" +
            "3. Отредактировать название.\n" +
            "4. Отредактирровать тип записи.\n" +
            "5. Вывести запись по индексу.\n" +
            "6. Вывести записи за определенную дату.\n" +
            "7. Выввести записи определенного типа.\n" +
            "8. Удалить запиь по индексу.";
    String typesListText = "1. Еда.\n" +
            "2. Коммунальные услуги.\n" +
            "3. Развлечения.\n" +
            "4. Транспорт.";
    String newCostText = "\nпосле выбора типа введите:\n" +
            "\"Имя\" и \"сумму\"";
    String enterTypeText = "выберите тип:";
    String enterNameText = "введите имя";
    String enterIndexText = "введите индекс";
    String enterDateText = "введите дату: год: \"yyyy\", месяц: \"mm\", день: \"dd\"";

    public String messegeController(int i){
        if(i == 1) return typesListText + newCostText;
        if(i == 2) return "";
        if(i == 3) return enterIndexText + "\n" + enterNameText;
        if(i == 4) return typesListText + "\n" + enterTypeText + "\n" + enterIndexText;
        if(i == 5) return enterIndexText;
        if(i == 6) return enterDateText;
        if(i == 7) return typesListText + "\n" + enterTypeText + "\n" + enterIndexText;
        if(i == 8) return enterIndexText;
        if(i == 9) return halloText;
        if(i == 10) return generalText;

        else return "";
    }
}
