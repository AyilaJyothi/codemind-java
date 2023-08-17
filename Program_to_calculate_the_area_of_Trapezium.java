import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=((a+b)*c)/2.0;
        System.out.printf("%.4f",d);
    }
}