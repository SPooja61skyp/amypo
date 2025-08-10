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
            int e=a/2;
        int d=a<<1;
        System.out.println(d +" " +e);
        
        }
    }
}

