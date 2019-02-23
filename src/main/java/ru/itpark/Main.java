package ru.itpark;

import ru.itpark.ru.itpark.service.CashbackService;

public class Main {
    public static void main(String[] args) {
        CashbackService service = new CashbackService();
        int cashback = service.calculate(1_000);
        System.out.println(cashback);
    }
}
