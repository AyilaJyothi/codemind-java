import java.util.Scanner;
public class Avg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a,b;
        double avg;
        a=sc.nextFloat();
        b=sc.nextFloat();
        avg=(a+b)/2;
        System.out.printf("%.4f",avg);
    }
}