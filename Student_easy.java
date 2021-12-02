public class Student_easy{
    String name;
    public Student_easy(String s){
        name = s;
    }
    public Student_easy(){
        name = "Unknown";
    }
}

class Ans{
    public static void main(String[] args){
        Student s = new Student("xyz");
        Student a = new Student();

        System.out.println(s.name);
        System.out.println(a.name);
    }
}
