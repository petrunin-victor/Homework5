public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 5");

        //Task 1
        System.out.println("Task 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 2
        System.out.println("Task 2");
        int clientOs = 0;
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015) {
            if (clientOs > 0) {
                System.out.println("Установите версию для Android по ссылке");
            } else {
                System.out.println("Установите версию для iOS по ссылке");
            }
        }
        else if (clientOs > 0) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        }

        //Task 3
        System.out.println("Task 3");
        int year = 100;
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
            System.out.println(+ year + " год является високосным");
        } else {
            System.out.println(+ year + " год не является високосным");
        }

        //Task 4
        System.out.println("Task 4");
        int deliveryDistance = 99;
        int deliveryDays = 1;
        if (deliveryDistance <=0 && deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        }
        else if (deliveryDistance >=60 && deliveryDistance < 100){
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        }
        else if (deliveryDistance == 100) {
            System.out.println("Для уточненения сроков доставки карты, свяжитесь с оператором");
        } else {
            System.out.println("Доставка карты невозможна");
        }

        //Task 5
        System.out.println("Task 5");
        int monthNumber = 7;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}