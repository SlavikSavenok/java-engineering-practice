package day2;

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
    }

    /**
     * Суммирует элементы массива.
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
}
