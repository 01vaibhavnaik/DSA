package Apptitude;

public class HasherdNumber {
    public static void main(String[] args) {
        int number = 10;
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is a Hasherd number.");
        } else {
            System.out.println(number + " is not a Hasherd number.");
        }
    }
}
