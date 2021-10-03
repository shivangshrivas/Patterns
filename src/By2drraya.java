import java.util.Scanner;
public class By2drraya {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter no of student");
        int n=s.nextInt();
        System.out.println("enter no of methods");
        int n1=s.nextInt();
        int[][] arr1 = new int[n][n1];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=s.nextInt();
                }
        }
        int max=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                if(arr1[i][j]>max){
                    max=arr1[i][j];
                }
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(max);

    }
}
