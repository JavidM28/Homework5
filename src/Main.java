public class Main {
    public static void main(String[] args) {
        //TASK 1
        int clientOS = 0;
        if (clientOS == 0)
        {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else
        {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        //TASK 2
        int clientOSNew = 0;
        int clientDeviceYear = 2014;
        if (clientOSNew == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
        }
        else if (clientOSNew == 0 && clientDeviceYear >= 2015)
        {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }
        else if (clientOSNew == 1 && clientDeviceYear < 2015)
        {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        else
        {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        //TASK 3
        int year = 1900;
        if (year < 1584)
            System.out.println(year + " год не является високосным.");
        else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " год является високосным.");
        else
            System.out.println(year + " год не является високосным.");

        //TASK 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20)
        {
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60)
        {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100)
        {
            System.out.println("Потребуется дней: 3");
        }
        else
        {
            System.out.println("Доставка недоступна.");
        }

        //TASK 5
        int monthNumber = 12;
        if (monthNumber < 1 || monthNumber > 12)
            System.out.println("Номер месяца некорректен. Пожалуйста, введите число от 1 до 12.");
        else {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень.");
                    break;
            }
        }


    }

}