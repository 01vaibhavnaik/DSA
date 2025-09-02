package Apptitude;

public class SwapNumber {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.println("Before Swapping: a="+a+" b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping: a="+a+" b="+b);
    }
}
