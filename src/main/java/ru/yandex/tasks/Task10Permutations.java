package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task10Permutations {
    public static List<List<Integer>> permutations(int[] numbers) {
        /*
         * Возвращает массив со всеми перестановками массива numbers (до 10 элементов, все по модулю до 10^5)
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> perm = new LinkedList<>();
        boolean[] used = new boolean[numbers.length];
        backtrack(ans, numbers, used, perm);

        return ans;
    }

    public static void backtrack(List<List<Integer>> ans, int[] numbers, boolean[] used, LinkedList<Integer> perm) {
        if (perm.size() == numbers.length) {
            ans.add(new ArrayList<>(perm));
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (!used[i]) {
                used[i] = true;
                perm.add(numbers[i]);
                backtrack(ans, numbers, used, perm);
                used[i] = false;
                perm.removeLast();
            }
        }
    }

    public static void selfCheck() {
        int[] input = {1, 2, 3};
        int[][] output = {
                {1, 2, 3},
                {1, 3, 2},
                {2, 1, 3},
                {2, 3, 1},
                {3, 1, 2},
                {3, 2, 1}
        };

        assert Arrays.deepEquals(new int[][]{input}, output);
    }
}
