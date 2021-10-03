import java.util.Scanner;

public class Equalstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int n= 0;
        if(s1.length()==s2.length())
        {   for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            char c1=s2.charAt(i);
            if(c==c1){
                n+=1;
            }
        }
        }
        else
            System.out.println("Both string length is unequal");
        if(n==s1.length())
            System.out.println("Both string is equal");
        else
            System.out.println("both string is not equal");

    }
}