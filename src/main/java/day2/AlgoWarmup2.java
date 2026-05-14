package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


/**
 * Алгоритмическая разминка второго дня.
 * Содержит задачи: сумма массива, реверс строки, фильтрация чётных чисел.
 */

public class AlgoWarmup2 {

    public static void main(String[] args) {
        Random random = new Random();

        int size = random.nextInt(101);
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sumArray(arr));

        String string = "AlgoWarmup2";
        System.out.println(reverseString(string));

        int listSize = random.nextInt(21);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            numbers.add(random.nextInt(101));
        }

        System.out.println("Original list: " + numbers);
        System.out.println("Even numbers: " + filterEven(numbers));
    }

    /**
     * Суммирует элементы массива.
     *
     * @param arr массив целых чисел
     * @return сумма элементов
     */
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Разворачивает строку в обратном порядке.
     *
     * @param s исходная строка
     * @return перевёрнутая строка
     */
    public static String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

    /**
     * Фильтрует список, оставляя только чётные числа.
     *
     * @param list исходный список целых чисел
     * @return новый список, содержащий только чётные числа
     */
    public static ArrayList<Integer> filterEven(ArrayList<Integer> list) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }
}


