import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.printf("Sum:%d
",(a+b));
        System.out.printf("Difference:%d
",(a-b));
        System.out.printf("Product:%d
",(a*b));
        System.out.printf("Quotient:%d
",(a/b));
        System.out.printf("Remainder:%d
",(a%b));
    }
}