import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int m,c=0;
        s=sc.nextLine();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            m=arr[i].length();
            if(c<=m)
            {
                c=m;
            }
        }
        System.out.print(c);
    }
}