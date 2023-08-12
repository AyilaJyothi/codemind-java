import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a;
        int n;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            a=sc.next();
            int x=Integer.parseInt(a,8);
            System.out.println(Integer.toString(x,2));
        }
    }
}