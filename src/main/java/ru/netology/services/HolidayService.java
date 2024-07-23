package ru.netology.services;

public class HolidayService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int balance = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (balance >= threshold) { // если мы отдыхаем?
                balance -= expenses;
                balance /=3;
                count++;
            } else {
                // если мы работаем?
                balance += income;
                balance -= expenses;
            }
        }
        return count;

    }
}
