package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1BubbleSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой пузырьком!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        boolean flag = true;
        for (int j = 0; j < numbers.size(); j++) {
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i) > numbers.get(i + 1)) {
                    int buf = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, buf);
                    flag = false;
                }
            }
            if (flag) return numbers;
            flag = true;
        }

        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        System.out.println(sort(input));
////        System.out.println(output);
        assert output.equals(sort(input));
    }
}
