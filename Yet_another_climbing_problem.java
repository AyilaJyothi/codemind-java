import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,n;
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            c=a/b;
            d=a%b;
            System.out.println(c+d);
        }
    }
}