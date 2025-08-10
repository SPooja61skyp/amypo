import java.util.Scanner;
public class P
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(n<=0 || k<=0)
        {
            System.out.println("-1");
        }
        else
        {
            int free_cups=n/k;
            int tot_cups=n+free_cups;
            System.out.println(tot_cups);
        }
    }
}