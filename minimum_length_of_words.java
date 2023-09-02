import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int m=0;
        s=sc.next();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            int c=arr[i].length();
            if(m<=c)
            {
                m=c;
            }
        }
        System.out.print(m);
    }
}