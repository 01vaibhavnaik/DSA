package Apptitude;

public class SentenceReverse {
    public static void main(String[] args) {
        String str="Hello World from Java";
        String rev="";
        String[] words=str.split(" ");
        int n=words.length;
        for(int i=n-1;i>=0;i--){
            rev=rev+words[i]+" ";
        }
        System.out.println(rev.trim());
    }
}
