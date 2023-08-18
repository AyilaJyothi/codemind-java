import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a%b==c)
        {
            System.out.print(1);
        }
        else if(a%(b*c)==0)
        {
            System.out.print(a/(b*c));
        }
        else 
        {
            System.out.print(1+(a/(b*c)));
        }
    }
}