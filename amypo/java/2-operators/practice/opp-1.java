import java.util.Scanner;
public class P
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int days=(a*365);
        System.out.println(days);
        }
    }
}