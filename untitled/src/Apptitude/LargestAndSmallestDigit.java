package Apptitude;

public class LargestAndSmallestDigit {
    public static void main(String[] args) {
        int num = 2736;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int digit;

        while (num != 0) {
            digit = num % 10;

            if (digit > largest) {
                largest = digit;
            }

            if (digit < smallest) {
                smallest = digit;
            }

            num = num / 10;
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Smallest digit: " + smallest);
    }
}
