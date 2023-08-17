import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a%b==0 || a/b<c)
        {
            System.out.print("YES");
        }
        else if(a%b!=0 || a/b>c)
        {
            System.out.print("NO");
        }
    }
}