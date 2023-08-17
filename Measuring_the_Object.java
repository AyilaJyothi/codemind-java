import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int w,x,y,z;
        w=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if(w==x || w==y || w==z || w==x+y || w==x+z || w==y+z || w==x+y+z)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}