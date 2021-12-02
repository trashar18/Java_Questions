import java.util.Scanner;

public class Exception_han {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try {
//            System.exist(0);
            int a=s.nextInt();
            int b=s.nextInt();
            int arr[]={122,45,67,89,90};
            int index =s.nextInt();
            System.out.println(a / b);             //Arithmatic Exception
            System.out.println(arr[index]);
//            throw new ArithmeticException("/by zero");

        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println(obj);
        }
        catch(IllegalAccessError obj){
            System.out.println(obj);
        }
        catch(ArithmeticException obj){                     //handler
            System.out.println(obj);
        }

        catch(Exception obj){
            System.out.println(obj);
        }

//        catch(ArrayIndexOutOfBoundsException | ArithmeticException | IllegalAccessError | Exception obj)
//        {
//            System.out.println(obj);  // now specifies 11111111111


//        }
        finally {
            System.out.println("Inside finally Block");
        }


        System.out.println("End of the main");
    }
}
