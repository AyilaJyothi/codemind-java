import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c,n;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a+b)<c || (b+c)<a || (a+c)<b)
        {
            System.out.print("YES
");
        }
        else
        {
            System.out.print("NO
");
        }
    }
}
}