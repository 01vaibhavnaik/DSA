package Apptitude;

public class ReversedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int[] rev=new int[n];
        for(int i=n-1,j=0;i>=0;i--,j++){
            rev[j]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(rev[i]+" ");
        }
    }
}
