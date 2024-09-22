//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        otstup();
        printLeapYear();
        otstup();
        int clientOs = 0;
        int clientDeviceYear = 2022;
        int getYear = 2024;
        printOC(clientOs, clientDeviceYear, getYear);
        otstup();
        int deliveryDistance = 15;
        int day = printKillometr(deliveryDistance);
        if (day > 0) {
            System.out.println("Потребуется: " + day + " дней, срок доставки.");
        } else {
            System.out.println("Доставки нет.");
        }
    }

    public static void printLeapYear() {
        int year = 2000;
        if (year > 1586) {
            System.out.println();
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void printOC(int clientOs, int clientDeviceYear, int getYear) {
        if (clientOs == 1 && clientDeviceYear > getYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOs == 0 && clientDeviceYear > getYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        if (clientDeviceYear < getYear && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        } else if (clientDeviceYear < getYear && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }
    }

    public static int printKillometr(int km) {

        if (km <= 20) {
            return 1;
        } else if (km > 20 && km < 60) {
            return 2;
        } else if (km >= 60 && km <= 100) {
            return 3;
        } else {
            return 0;
        }


    }

    public static void otstup() {
        System.out.println("========================");
    }
}
