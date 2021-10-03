public class array {
    public void replace(int[] arr,int c){
        arr[c]=5;
        System.out.println("final array");
        for(int i=0;i<arr.length;i++)
            System.out.print(" "+arr[i]);
    }
    public static void main(String[] args) {
        array obj =new array();
        int[] a={1,2,3,4,5};
        int b=1;
        System.out.println("intial array");
        for(int i:a){
            System.out.println(i);
        }
        obj.replace(a,b);
    }
}
