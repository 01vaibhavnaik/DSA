package Apptitude;

public class MinMax {
    public static void main(String[] args) {
        int[] numbers = {45, 22, 89, 12, 67, 34};
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
