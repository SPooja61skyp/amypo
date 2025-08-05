import java.util.Scanner;
public class P
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a=Integer.toHexString(n).toUpperCase();
        String b=Integer.toOctalString(n);
        System.out.println(a);
        System.out.println(b);
    }
}