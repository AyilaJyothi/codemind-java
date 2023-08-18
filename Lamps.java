import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,k,x,y,m;
        n=sc.nextInt();
        k=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        if(n==k)
        {
            System.out.print(k*x);
        }
        else if(x>y)
        {
            System.out.print((k*x)+(n-k)*y);
        }
        else
        {
            System.out.print((k*x)+(n-k)*x);
        }
    }
}