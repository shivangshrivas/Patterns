import java.util.Scanner;

public class Equalarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of 1 array");
        int n=s.nextInt();
        int[] arr1=new int[n];
        System.out.println("enter the size of 2 array");
        int n1= s.nextInt();
        int[] arr2=new int[n1];
        int count=0;
        System.out.println("enter the values of arr1");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("enter the value of arr2");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=s.nextInt();
        }if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                arr1[i]=arr2[i];
                count+=1;
            }
        }else
            System.out.println("Both array length is not equal");
        if(count==arr2.length){
            System.out.println("Both array are equal");
        }
        else
            System.out.println("both array is not equal");
    }
}
