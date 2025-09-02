package Apptitude;

public class CountNumberOfWords {
    public static void main(String[] args) {
        String str="Hello World from Java";
        String[] words=str.split(" ");
        int count=words.length;
        System.out.println("Number of words: "+count);
    }
}
