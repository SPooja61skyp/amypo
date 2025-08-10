import java.util.Scanner;
public class P
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input");
            return;
        }
        int[]arr=new int[n];
        int mul=1;
        for(int i=0;i<n;i++)
        {
            if(!sc.hasNextInt())
            {
                System.out.println("Invalid input");
                return;
            }
            arr[i]=sc.nextInt();
            mul*=arr[i];
        }
        System.out.println(mul);
    }
}