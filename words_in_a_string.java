import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int c=0;
        s=sc.nextLine();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            c=c+1;
        }
        System.out.print(c);
    }
}