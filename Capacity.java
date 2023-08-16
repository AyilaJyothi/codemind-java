import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,s,b,cap;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        cap=t*s*b;
        System.out.printf("%d KB",cap);
    }
}