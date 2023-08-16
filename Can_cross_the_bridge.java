import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,y,z,c;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        c=(z-y)/x;
        System.out.print(c);
    }
}