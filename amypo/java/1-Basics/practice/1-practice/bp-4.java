import java.util.Scanner;
public class P
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=((a*2)+(b*4)+(c*4));
        System.out.println(d);
    }
}