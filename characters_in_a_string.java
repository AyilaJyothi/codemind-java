import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        char[] arr=s.toCharArray();
        System.out.print(arr.length);
    }
}