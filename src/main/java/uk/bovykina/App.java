package uk.bovykina;

import uk.bovykina.controller.WeekdayController;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите название дня недели на английсокм:");
        WeekdayController wc = new WeekdayController();
        System.out.println(wc.dayOfWeek(scn.next()));
    }
}
