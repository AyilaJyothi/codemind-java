import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=21-(a+b);
        if(a+b>=11)
        {
            System.out.print(c);
        }
        else
        {
            System.out.print(-1);
        }
    }
    
}