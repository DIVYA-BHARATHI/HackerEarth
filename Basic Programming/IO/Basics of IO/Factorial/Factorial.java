import java.io.*;
import java.util.*;
 
public class Factorial{
    public static void main(String args[]) throws IOException
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k=1;
        int i;
        if(n>=1 && n<=10)
        {
            for(i=1;i<=n;i++)
                k = k * i;
            System.out.println(k);
        }
       
    }
}
