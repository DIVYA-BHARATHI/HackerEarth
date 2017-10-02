import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
 
public class ArraySum
{
    public static void main(String args[]) throws Exception
    {
        try
        {
            ArrayList<Long> a = new ArrayList/*<long>*/();
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            long sum = 0;
            for(int i=0; i<n; i++)
            {
                a.add(s.nextLong());
            }
            for(long j : a)
            {
                sum = sum + j;
            }
            System.out.println(sum);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
