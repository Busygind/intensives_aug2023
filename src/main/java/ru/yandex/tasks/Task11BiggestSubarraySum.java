package ru.yandex.tasks;

public class Task11BiggestSubarraySum {

    public static Subarray find(int[] numbers) {
        /*
         * Находит подмассив (подряд идущие элементы массива) с наибольшей суммой элементов
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: Subarray
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        Subarray subarray = new Subarray();
        int maxSum = -100001, curSum = 0;
        int start = 0;
        for (int end = 0; end < numbers.length; end++) {
            curSum += numbers[end];
            if (maxSum < curSum) {
                maxSum = Math.max(maxSum, curSum);
                subarray.left = start;
                subarray.right = end + 1;
            }

            while (curSum < 0 && start <= end) {
                curSum -= numbers[start];
                start++;
            }
        }

        return subarray;
    }

    public static void selfCheck() {
        int[] output = {1, 2, -5, 7, -1, 6};
        Subarray ans = find(output);
        int[] output1 = {1};
        Subarray ans1 = find(output1);
        int[] output2 = {-1, -2, -3};
        Subarray ans2 = find(output2);
        int[] output3 = {-3, -2, -1};
        Subarray ans3 = find(output3);

        assert ans != null;
        assert (ans.left == 3 && ans.right == 6);
        assert (ans1.left == 0 && ans1.right == 1);
        assert (ans2.left == 0 && ans2.right == 1);
        assert (ans3.left == 2 && ans3.right == 3);
    }
}
