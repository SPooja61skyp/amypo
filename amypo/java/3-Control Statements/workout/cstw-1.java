import java.util.Scanner;
public class P
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<0)
        {
            System.out.println("Invalid input");
        }
        if(age==21 || age>21)
        {
            System.out.println("Full access granted");
        }
        else if(age>=18 && age<20)
        {
         System.out.println("Limited access granted");   
        }
        else if(age<18)
        {
            System.out.println(" Access denied");
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}