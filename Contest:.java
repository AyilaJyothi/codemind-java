import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,x;
        x=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        a=1*b+2*c;
        if(x<=a)
        {
            System.out.print("Qualify");
        }
        else
        {
            System.out.print("Not Qualify");
        }
    }
}