package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }


    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturn500IfAmountIs1500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturn1500IfAmountIsMinus500() {
        CashbackHackService service = new CashbackHackService();
        int amount = -500;

        int actual = service.remain(amount);
        int expected = 1500;

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturn1000IfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

}