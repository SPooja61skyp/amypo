import java.util.Scanner;
public class P
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int temp=a;
        while(temp>0)
        {
            sum+=temp%10;
            temp/=10;
        }
        System.out.println(sum);
}
}
