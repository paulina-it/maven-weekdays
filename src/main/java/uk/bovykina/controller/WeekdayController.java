package uk.bovykina.controller;

import java.time.DayOfWeek;

public class WeekdayController {
    private String[] daysRus = new String[]{
            "Понедельник",
            "Вторник",
            "Среда",
            "Четверг",
            "Пятница",
            "Суббота",
            "Воскресенье"
    };

    public String dayOfWeek(String name) {
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(name.toUpperCase());
        int dayNumber = dayOfWeek.getValue();
        String dayRus = daysRus[dayNumber - 1];
        return String.format("Сегодня %s!", dayRus);
    }
}