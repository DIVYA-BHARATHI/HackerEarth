import java.io.*;
import java.util.*;
import java.math.*;
 
public class Profile
{
    public static void main(String args[]) throws Exception
    {
        Scanner s = new Scanner(System.in);
        int L = s.nextInt();
        int N = s.nextInt();
        int[] W = new int[N];
        int[] H = new int[N];
        int i;
        
        for(i=0; i<N; i++)
        {
           W[i] = s.nextInt();
           H[i] = s.nextInt();
        }
        
        for (i=0; i < N; i++)
        {
            if(W[i] >= L && H[i] >= L)
            {
                if(W[i] == H[i])
                    System.out.println("ACCEPTED");
                else 
                    System.out.println("CROP IT");
            }
            else if(W[i]<L || H[i]<L)
                System.out.println("UPLOAD ANOTHER");
                
            
        }
    }
}
