public class Main {

        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
        }
        public static void task1() {
            System.out.println("Задача 1");
            int clientOS = 0;
            if (clientOS == 0) {
                System.out.println(" Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println(" Установите версию приложения для Android по ссылке");
            }
        }
        public static void task2() {
            System.out.println("Задача 2");
            int clientOS = 0;
            int year = 2010;

            if (year < 2015) {
                if (clientOS == 0) {
                    System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println(" Установите облегченную версию приложения для Android по ссылке");
                }
            } else {
                if (clientOS == 0) {
                    System.out.println(" Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println(" Установите версию приложения для Android по ссылке");
                }
            }}
        public static void task3() {
            System.out.println("Задача 3");
            int year = 2021;
            if (year % 4 == 0 && year % 400 != 0 || year %100 == 0) {
                System.out.println(" Високосный год");
            } else {
                System.out.println( " Невисокосный год");
            }
        }
        public static void task4() {
            System.out.println("Задача 4");
            int deliveryDistance = 95;
            if (deliveryDistance > 0 && deliveryDistance < 20) {
                System.out.println("Потребуется км " +deliveryDistance + " доставка занимает сутки");
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется км " +deliveryDistance + " доставка занимает двое суток");
            } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                System.out.println("Потребуется км " +deliveryDistance + " доставка занимает трое суток");
            } else {
                System.out.println(" Доставки нет");
            }
        }
        public static void task5() {
            System.out.println("Задача 5");
            int month = 1;
            switch (month) {
                case 1,2,12:
                    System.out.println("Зима");
                    break;
                case 3,4,5:
                    System.out.println("Весна");
                    break;
                case 6,7,8:
                    System.out.println("Лето");
                    break;
                case 9,10,11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Не известно");

            }
        }
    }
