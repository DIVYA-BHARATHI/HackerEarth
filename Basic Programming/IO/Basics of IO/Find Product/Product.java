import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.BigInteger;
 
public class Product
{
    public static void main(String args[]) throws Exception{
    try{
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    BigInteger p = new BigInteger("1");
    int x = (int)Math.pow(10,9) + 7;
    if(n>=1 || n<=(10^3))
    {
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            {
              a[i] = s.nextInt();
              //if(a[i]>=1 && a[i]<=(10^3))
            //  {
              p = (p.multiply(BigInteger.valueOf(a[i]))).mod(BigInteger.valueOf(x));
            // }
            // else
              //  System.exit(0);
            }
        System.out.println(p);
    }
    else
        System.exit(0);
    }
    
     catch(Exception e)
    {
        System.exit(0);
    }
    }
   
}
