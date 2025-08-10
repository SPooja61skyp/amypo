import java.util.Scanner;
public class P
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[10];
        if(n<0)
        {
            System.out.println("Invalid input");
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        System.out.print(arr[i]+" ");
        }
    }
}