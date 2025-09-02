package Apptitude;

public class DuplicateString {
    public static void main(String[] args) {
        String str="Hello World from Java Hello World";
        String dup="";
        String[] words=str.split(" ");
        int n=words.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(words[i].equals(words[j]) && !dup.contains(words[i])){
                    dup=dup+words[i]+" ";
                }
            }
        }
        System.out.println(dup.trim());
    }
}
