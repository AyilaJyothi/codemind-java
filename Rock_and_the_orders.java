import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a1,a2,a3,b1,b2,b3,c,d,e,f;
        c=sc.nextInt();
        d=sc.nextInt();
        a1=sc.nextInt();
        a2=sc.nextInt();
        a3=sc.nextInt();
        b1=sc.nextInt();
        b2=sc.nextInt();
        b3=sc.nextInt();
        e=a1+a2+a3;
        f=b1+b2+b3;
        if(e>=150 && f>=150)
        {
              if((e+f+c+c)>(e+f+d))
              {
                  System.out.print("YES");
              }
              else
              {
                  System.out.print("NO");
              }
        }
        else if((e>=150 && f<=150) || (e<=150 && f>=150))
        {
              if((e+f+c+c)>(e+f+d+c))
              {
                  System.out.print("YES");
              }
              else
              {
                  System.out.print("NO");
              }
        }
        else
        {
                System.out.print("NO");
        }
            
    }
}