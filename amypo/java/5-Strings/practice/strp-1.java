import java.util.Scanner;
public class stringss4 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=0 && a< str.length())
        {
            System.out.println(str.charAt(a));
        }
        else{
            System.out.println("Invalid input");
        }
         if(a>=0 && b< str.length())
        {
            System.out.println(str.charAt(b));
        }
        else{
            
            System.out.println("Invalid input");
        }

    
}
}