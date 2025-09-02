package Apptitude;

public class MinMaxSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        long totalSum = 0;
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        long minSum = totalSum - max;
        long maxSum = totalSum - min;

        System.out.println("Minimum Sum: " + minSum);
        System.out.println("Maximum Sum: " + maxSum);
    }
}
