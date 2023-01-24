import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
    }

    private static int[] generateRandomArray(){
        java.util.Random random = new java.util.Random();
        int [] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task_1() {
        /*
        Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        «Сумма трат за месяц составила … рублей».
         */
        System.out.println("\nЗадача 1");

        int[] arr = generateRandomArray();
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];

        }
//        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей");
    }

    private static void task_2() {
        /*
        Также бухгалтерия попросила найти минимальную и максимальную трату за день.

        Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
         */
        System.out.println("\nЗадача 2");
        int [] arrAmount = generateRandomArray();
        int minAmount = arrAmount[0];
        int maxAmount = 0;

        for (int i = 0; i < arrAmount.length; i++) {
            if (arrAmount[i] > maxAmount) {
                maxAmount = arrAmount[i];
            }

            if (arrAmount[i] < minAmount) {
                minAmount = arrAmount[i];
            }
        }
//        System.out.println(Arrays.toString(arrAmount));
        System.out.println("Минимальная сумма трат за день составила " + minAmount +
                " рублей. Максимальная сумма трат за день составила " + maxAmount + " рублей");

    }

    private static void task_3() {
        /*
        Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.

        Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат
        за месяц поделить на количество дней), и выведите в консоль результат в формате:
        «Средняя сумма трат за месяц составила … рублей».

        Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
         */
        System.out.println("\nЗадача 3");

        int[] arrAmount = generateRandomArray();
        int totalSum = 0;

        for (int i = 0; i < arrAmount.length; i++) {
            totalSum = totalSum + arrAmount[i];
        }
//        System.out.println(totalSum);
        double avgAmount = (double) totalSum / arrAmount.length;

        System.out.println("Средняя сумма трат за месяц составила " + avgAmount + " рублей");
    }

    private static void task_4() {
        /*
        В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться
        в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся
        в виде массива символов — char[ ].

        Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
        В качестве данных для массива используйте:

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        В результате в консоль должно быть выведено: Ivanov Ivan.

        Важно: не используйте дополнительные массивы для решения этой задачи.
        Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
         */
        System.out.println("\nЗадача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//        System.out.println(Arrays.toString(reverseFullName));

        for (int i = reverseFullName.length - 1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
