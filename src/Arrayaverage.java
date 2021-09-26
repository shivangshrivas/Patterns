import java.util.Scanner;
public class Arrayaverage {
    public static void main(String[] args) {
        int sum=0,average;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }

        for(int j=0;j<n;j++){
            sum=sum+a[j];
        }
        average=sum/n;
        System.out.println("the average of "+ n+"student is"+average);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }

    }
}
