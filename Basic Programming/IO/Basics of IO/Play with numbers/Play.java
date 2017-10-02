import java.io.*;
import java.util.*;
 
 
 
public class Play
{
   public static void main(String args[] ) throws Exception 
   {
       try{
   Scanner s = new Scanner(System.in);
   int n=s.nextInt();
   int q=s.nextInt();
   long a[]=new long[n];
   for(int i=0;i<n;i++)
   {
        if(i==0)
            a[i]=s.nextInt();
        else
            a[i]=a[i-1]+s.nextInt();
   }
    StringBuffer str = new StringBuffer();
   while(q--!=0)
   {
       int l = s.nextInt();
       int r = s.nextInt();
       long sum = 0;
       if(l==1)
            sum=a[r-1]/(r-l+1);
       else
            sum=(a[r-1]-a[l-2])/(r-l+1);
       str.append(sum);
       str.append("\r");
       //q--;
     
   }
     System.out.println(str.toString());
}
 
        catch(Exception e)
        {
            System.out.println(e);
        }
}
}
