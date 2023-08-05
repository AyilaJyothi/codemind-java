import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a,b,c,t;
        double area;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        t=(a+b+c)/2;
        area=Math.sqrt(t*(t-a)*(t-b)*(t-c));
        System.out.printf("%.2f",area);
    }
}