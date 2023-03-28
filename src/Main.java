import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2023);
        appInstall(0, 2015);
        deliveryDaysCal(95);
    }

    public static void checkLeapYear(int year) {
        int leapYear1 = year % 4;
        int leapYear2 = year % 400;
        int noLeapYear = year % 100;

        if(leapYear1 == 0 || leapYear2 == 0 && noLeapYear != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void appInstall(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if(clientDeviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= currentYear && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientDeviceYear >= currentYear && clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int deliveryDaysCal(int deliveryDistance) {
        int timeDelivery = 1;

        if(deliveryDistance >= 20) {
            timeDelivery++;
        }
        if(deliveryDistance >= 60) {
            timeDelivery++;
        }
        if(deliveryDistance >= 100) {
            System.out.println("Свыше 100 км доставки нет");
            timeDelivery = -1;
        } else {
            System.out.println("Потребуется дней: " + timeDelivery);
        }
        return timeDelivery;
    }
}