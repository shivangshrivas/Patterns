import java .util.Scanner;
public class Vowelcount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st= s.next();
        int count=0;
        for(int i=0;i<st.length();i++){
            char p=st.charAt(i);
            if(p=='A' || p=='a' || p=='E' || p=='e' || p == 'I' || p == 'i' || p=='O' || p=='o' || p=='U' || p=='u'){
                System.out.println(p);
                count+=1;
            }
        }
        System.out.println("total no of vowel is  :"+count);


    }
}
