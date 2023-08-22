import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m,n,r=0;
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            if(i%3==0)
            r++;
        }
        System.out.printf("%d ",r);
    }
}