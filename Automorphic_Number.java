import java.util.Scanner;  
public class Sample{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        int c=0;  
        int square = n*n;  
        int temp = n;    
        while(temp>0)
        {  
            c++;  
            temp=temp/10;  
        }   
        int lastDigit = (int) (square%(Math.pow(10, c)));   
        if(n==lastDigit)  
        {
            System.out.println("Automorphic Number");  
        }
        else  
        {
            System.out.println("Not an Automorphic Number");  
        }
    }  
}