package Apptitude;

public class Armstrong {
    public static void main(String[] args) {
        int digit;
        int mult = 0;
        int num=153;

        while (num != 0) {
            digit = num % 10;
            mult += digit * digit * digit;
            num = num / 10;
        }

        if(num==mult){

            System.out.println("Armstrong");
        }
        else {

            System.out.println("Not Armstrong");
        }

    }
}
