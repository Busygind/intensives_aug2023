package ru.yandex.tasks;

import java.util.Stack;

public class Task6BraceBalance {
    public static boolean checkBalance(String sequence) {
        /*
         * sequence - последовательность скобок []{}() длины до 10^5
         * Выход: true/false, является ли строка ПСП
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        if (sequence == null) return true;
        Stack<Character> stack = new Stack<>();
        for (char brace : sequence.toCharArray()) {
            if (brace == '{' || brace == '[' || brace == '(') {
                stack.push(brace);
                continue;
            }
            if (stack.isEmpty()) return false;
            if (brace == ')' && stack.peek() == '(') {
                stack.pop();
                continue;
            }
            if (brace == '}' && stack.peek() == '{') {
                stack.pop();
                continue;
            }
            if (brace == ']' && stack.peek() == '[') {
                stack.pop();
                continue;
            }
            return false;
        }

        return stack.isEmpty();
    }

    public static void selfCheck() {
        String test1 = "[({})]{[]}";
        String test2 = "{({})}{";
        String test3 = "";
        String test4 = "[";
        String test5 = "]";
        String test6 = "[]";
        String test7 = "{]";

        assert checkBalance(test1);
        assert !checkBalance(test2);
        assert checkBalance(test3);
        assert !checkBalance(test4);
        assert !checkBalance(test5);
        assert checkBalance(test6);
        assert !checkBalance(test7);
    }
}
