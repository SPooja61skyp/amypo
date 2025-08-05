import java.util.Scanner;
public class P
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double inches=sc.nextDouble();
        double metres=inches*0.0254;
        System.out.println(metres);
    }
}