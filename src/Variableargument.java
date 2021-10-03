public class Variableargument {
    public void sum(int ...a){
        for(int i:a){
            System.out.print(" "+i);
        }
    }
    public static void main(String[] args) {
        Variableargument obj = new Variableargument();
        obj.sum(10,20);
        obj.sum(10,20,30,40);
        obj.sum(10,20,30,40,50,60,70,80);
    }
}
