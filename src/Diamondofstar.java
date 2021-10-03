import java.util.Scanner;

public class Diamondofstar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),p;
        p=(int)n/2+1;
        for(int i=1;i<=p;i++){
            for(int j=p-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        int q=(int)n/2;
        for(int i=1;i<=q;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2;k++){
                System.out.print("*");
            }
            for(int l=n;l>=i;l--){
                System.out.println(" ");
            }
            System.out.println();


        }
        }
    }

