import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        float a,b,c,s;
        double area;
        a=t.nextInt();
        b=t.nextInt();
        c=t.nextInt();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}