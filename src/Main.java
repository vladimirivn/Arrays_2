public class Main {
        public static void main(String[] args) {
//  Массивы. Часть 2

            task1();
            task2();
            task3();
            task4();
        }
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
        public static void task1() {
            System.out.println("---------------------- Задача 1 ---------------------");

            int[] arr = generateRandomArray();
            int sumMonth = 0;
            for (int sumDay : arr) {
                sumMonth += sumDay;
            }
            System.out.printf("Сумма трат за месяц составила %d рублей", sumMonth);
        }
        public static void task2() {
            System.out.println();
            System.out.println("---------------------- Задача 2 ---------------------");

            int[] arr = generateRandomArray();
            int maximum = arr[0];
            int minimum = arr[0];
            for (int elementValue : arr) {
                if (minimum > elementValue){
                    minimum = elementValue;
                }
                if(maximum < elementValue) {
                    maximum = elementValue;
                }
            }
            System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей", minimum,maximum);
        }
        public static void task3() {
            System.out.println();
            System.out.println("---------------------- Задача 3 ---------------------");

            int[] arr = generateRandomArray();
            int sumMonth = 0;
            for (int sumDay : arr) {
                sumMonth += sumDay;
            }
            double sumAverage = (double) sumMonth / arr.length;
            System.out.printf("Средняя сумма трат за месяц составила %s рублей", String.format("%.2f",sumAverage));
        }
        public static void task4() {
            System.out.println();
            System.out.println("---------------------- Задача 4 ---------------------");

            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
/*
            for (int i = 0, j = reverseFullName.length - 1; i < j; i++, j--) {
                char temp = reverseFullName[i];
                reverseFullName[i] = reverseFullName[j];
                reverseFullName[j] = temp;
            }
//            System.out.println(Arrays.toString(reverseFullName));
            for (int elementValue : reverseFullName) {
                System.out.print((char) elementValue);
*/
            for (int i = reverseFullName.length - 1; i >=0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }
}