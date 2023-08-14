package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3InsertionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой вставками!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        for (int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);
            int j = i - 1;
            while (j >= 0 && current < numbers.get(j)) {
                swap(numbers, j, j + 1);
                j--;
            }
        }

        return numbers;
    }

    public static void swap(ArrayList<Integer> numbers, int i, int j) {
        int buf = numbers.get(i);
        numbers.set(i, numbers.get(j));
        numbers.set(j, buf);
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
