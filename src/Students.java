import java.util.Scanner;
public class Students {
    int roll;
    int height;
    int age;
    String name;

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of students");
        int n=s.nextInt();
        Students[] stu=new Students[n];
        for(int i=0;i<stu.length;i++){
            stu[i]=new Students();
            System.out.println("enter roll,height,age,name");
            stu[i].roll=s.nextInt();
            stu[i].height=s.nextInt();
            stu[i].age=s.nextInt();
            stu[i].name=s.next();
        }
        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i].roll);
            System.out.println(stu[i].height);
            System.out.println(stu[i].age);
            System.out.println(stu[i].name);
        }
        int max=0,c=0,maxh=0,d=0,mroll=0,e=0;
        for(int i=0;i<stu.length;i++){
            if(stu[i].age>=max){
                max=stu[i].age;
                c=i;
            }
            if(stu[i].height>=maxh){
                maxh=stu[i].height;
                d=i;
            }
            if(stu[i].roll>=mroll){
                mroll=stu[i].roll;
                e=i;
            }
        }

        System.out.println("The maximum age of "+ stu[c].name +" is "+ max);
        System.out.println("The maximum height of "+ stu[d].name+" is"+ maxh);
        System.out.println("The maximum roll no of "+ stu[e].name+" is"+ mroll);

    }
}
