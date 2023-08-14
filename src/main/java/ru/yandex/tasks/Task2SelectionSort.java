package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2SelectionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой выбором!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        int minValue = 100001, minIdx = 0;
        for (int i = 0; i < numbers.size(); i++) {

            for (int j = i; j < numbers.size(); j++) {
                if (numbers.get(j) < minValue) {
                    minValue = numbers.get(j);
                    minIdx = j;
                }
            }
            int buf = numbers.get(i);
            numbers.set(i, minValue);
            numbers.set(minIdx, buf);
            minValue = 100001;
        }

        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
