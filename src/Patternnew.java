import java.util.Scanner;
public class Patternnew {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int h=s. nextInt();
        int n=h;
        char c='A';
        for(int i=1;i<=h;i++){
            for(int j=1;j<=i;j++){
                char e =(char)('A'+n-j);

                System.out.print(e);
            }
            System.out.println();}
    }

}
