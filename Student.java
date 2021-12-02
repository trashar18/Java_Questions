import java.util.Scanner;

public class Student {
    int age;
    String name,address;
    public Student(){
        name="Unknown";
        age=0;
        address="Not available";

    }
    public setinfo(String na,int a){
        name=na;
        age=a;
    }
    public void setinfo(String na,int ag,String addre){
        name=na;
        age=ag;
        address=addre;

    }

}


class Test{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 0; i <=n ; i++) {
            Student Obj1 = new Student();


        }
    }

}
