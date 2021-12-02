//Q3. Create a class named 'Member' having the following members:
//
//        Data members
//        1 - Name
//        2 - Age
//        3 - Phone number
//        4 - Address
//        5 - Salary
//        It also has a method named 'printSalary' which prints the salary of the members.
//        Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number,
//        address and salary to an employee and a manager by making an object of both of these classes and print the same


public class Member{
    String Name ;
    int Age;
    String phone_number;
    String Address;
    int Salary;
    public void printSalary(){
            System.out.println(Salary);
        }
    }

class Employee extends Member{
    String specalation ;
}
class Manager extends Member{
    String department;

}

class ans{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.Name="xyz";
        e.Age=20;
        e.phone_number="8454413914";
        e.Address="Gla Unversity";
        e.Salary=45000;
        e.specalation="AIML";

        Manager m=new Manager();
        m.Name="yza";
        m.Age=21;
        m.Address="College";
        m.phone_number="556556588";
        m.Salary=44000;
        m.department="CEA";
    }
}
