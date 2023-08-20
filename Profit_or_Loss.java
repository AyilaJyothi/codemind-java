import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b)
        {
            System.out.print("Profit");
        }
        else if(a>b)
        {
            System.out.print("Loss");
        }
        else
        {
            System.out.print("No profit and No loss");
        }
   }
}