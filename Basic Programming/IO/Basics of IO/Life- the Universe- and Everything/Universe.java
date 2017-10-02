import java.io.*;
import java.util.*;
 
public class Universe
{
    public static void main(String srgs[]) throws IOException
    {
        Scanner s = new Scanner(System.in);
        int i=1;
        while(i==1)
        {
            int a = s.nextInt();
            if(a==42)
            {
                i=0;
                break;
            }
            else
            {
                i=1;
                System.out.println(a);
            }
            
        }
    }
}
