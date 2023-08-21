import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a+b)>(b+c) && (a+b)>(a+c))
        {
            System.out.print(a+b);
        }
        else if((a+c)>(b+c) && (a+c)>(a+b))
        {
            System.out.print(a+c);
        }
        else
        {
            System.out.print(b+c);
        }
    }
}