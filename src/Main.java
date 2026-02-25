//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        checkLeapYear(2021);
        task2();
        recognitionSoftware(0, 2015);
        task3();
        System.out.println("Потребуется дней: " + calculateDeliveryDays(95));

    }

    public static void task1() {
        System.out.println("Задача 1");
    }

    public static void checkLeapYear(int year) {
        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

    }

    public static void recognitionSoftware(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            return deliveryDays;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays += deliveryDays;
            return deliveryDays;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 2;
            return deliveryDays;
        } else {
            return -1;
        }
    }
}