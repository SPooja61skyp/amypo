import java.util.Scanner;
public class P
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<16)
        {
            System.out.println("Not eligible");
        }
        else if(n>=16)
        {
            System.out.println("Eligible");
        }
        
        else
        {
            System.out.println("Not eligible");
        }
    }
}