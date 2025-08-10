import java.util.Scanner;
public class P
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String bin_str=sc.nextLine().trim();
        if(!bin_str.matches("[01]+"))
        {
            System.out.println("Invalid input");
        }
        else
        {
        int deci=Integer.parseInt(bin_str,2);
        System.out.println(deci);
        }
        
    }
}