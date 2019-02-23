package ru.itpark.ru.itpark.service;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @org.junit.jupiter.api.Test
    void calculateUnderLimit() {
        CashbackService service = new CashbackService();
        int cashback = service.calculate(1_000);
        assertEquals(50, cashback);
    }
    @org.junit.jupiter.api.Test
    void calculateOverLimit() {
        CashbackService service = new CashbackService();
        int cashback = service.calculate(1_000_000);
        assertEquals(3_000, cashback);

    }
}