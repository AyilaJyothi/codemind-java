import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h;
        h=sc.nextInt();
        double cm;
        cm=2.54*h;
        System.out.printf("%.2f",cm);
    }
}