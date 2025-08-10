import java.util.Scanner;
public class P
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        boolean rec=sc.nextBoolean();
        if(score>=50 || rec)
        {
            System.out.println("The student passes");
            
        }
        else
        {
            System.out.println("The student fails");
        }
    }
}