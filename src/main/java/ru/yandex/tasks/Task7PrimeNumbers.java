package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7PrimeNumbers {
    public static int[] findPrimes (int n) {
        /*
         * 2 <= N <= 10^6
         * Выход: отсортированный массив всех простых чисел от 2 до N
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        List<Integer> answer = new ArrayList<>();
        boolean[] sieve = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (sieve[i]) continue;
            answer.add(i);
            for (int j = 2 * i; j <= n; j += i) {
                sieve[j] = true;
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void selfCheck() {
        int[] output = {2, 3, 5};
        int[] output1 = {2};

        assert (Arrays.equals(output, findPrimes(5)));
        assert (Arrays.equals(output, findPrimes(6)));
        assert (Arrays.equals(output1, findPrimes(2)));
    }
}
