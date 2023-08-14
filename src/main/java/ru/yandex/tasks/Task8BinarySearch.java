package ru.yandex.tasks;

public class Task8BinarySearch {
    public static int find(int number, int[] sortedList) {
        /*
         * number: целое число, -10^5 <= number <= 10^5
         * numbers: массив целых чисел, 0 <= numbers.length <= 10^5 (числа не повторяются)
         * Выход: i, где numbers[i] = number, -1, если такого i нет
         * Если таких i несколько, вывести наибольший
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        int l = 0, r = sortedList.length - 1, m;
        while (l < r) {
            m = (l + r + 1) / 2;
            if (sortedList[m] <= number) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (sortedList[l] != number) return -1;
        else return l;
    }

    public static void selfCheck() {
        int[] input = {1, 3, 5, 7, 9};
        int[] input1 = {1, 3, 5, 5, 7, 9};
        int[] input2 = {1, 3, 5, 5, 7};
        int[] input3 = {1, 3, 5, 5, 5, 7};

        for (int i = 0; i < input.length; i++) {
            assert (find(input[i], input) == i);
        }

        assert (find(input1[2], input1) == 3);
        assert (find(input2[2], input2) == 3);
        assert (find(input3[2], input3) == 4);
    }
}
