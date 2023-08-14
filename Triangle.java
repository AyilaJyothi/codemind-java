import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a==b && a==c && b==c)
        {
           System.out.print("Equilateral triangle");
        }
        else if(a==b || a==c || b==c)
        {
            System.out.print("Isosceles triangle");
        }
        else
        {
            System.out.print("Scalene triangle");
        }
    }
}