import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k,s=0;
        while(n!=0)
        {
            k=n%10;
            s=s*10+k;
            n=n/10;
        }
        System.out.print(s);
    }
}