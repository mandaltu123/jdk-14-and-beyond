package com.tuhin.sample.misc;

public class Test {

    public static void main(String[] args) {

        int numbers[] = {10, 3, 5, 3, 8};
        System.out.println(findMin(numbers));
    }

    /**
     * Correct this code.
     * @param a
     * @return
     */
    public static int findMin(int a[]) {
        int min = 0;
        int previousMin = 0;
        for (int n : a) {
            min = previousMin;
            if (n < previousMin) {
                previousMin = n;
                min = previousMin;
            }
        }
        return min;
    }
}
