import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>20)
        {
            System.out.print("HOT");;
        }
        else
        {
            System.out.print("COLD");
        }
    }
}