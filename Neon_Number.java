import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,m,r;
        m=n*n;
        while(m!=0)
        {
            r=m%10;
            m=m/10;
            s=r+s;
        }
        if(s==n)
        {
            System.out.print("Neon Number");
        }
        else
        {
            System.out.print("Not Neon Number");
        }
    }
}