import java.io.*;
import java.util.*;
 
 
public class Seat
{
    public static void main(String args[]) throws IOException
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0; i<t; i++)
        {
            int n = s.nextInt();
            int q = n%12;
            switch(q)
            {
                case 1 :
                    n=n+11;
                    System.out.println(n + " WS");
                    break;
                case 2 :
                    n=n+9;
                    System.out.println(n + " MS");
                    break;
                case 3 :
                    n=n+7;
                    System.out.println(n  + " AS");
                    break;
                case 4 :
                    n=n+5;
                    System.out.println(n  + " AS");
                    break; 
                case 5 :
                    n=n+3;
                    System.out.println(n  + " MS");
                    break;
                case 6 :
                    n=n+1;
                    System.out.println(n  + " WS");
                    break;
                case 7 :
                    n=n-1;
                    System.out.println(n  + " WS");
                    break;
                case 8 :
                    n=n-3;
                    System.out.println(n  + " MS");
                    break;
                case 9 :
                    n=n-5;
                    System.out.println(n  + " AS");
                    break;
                case 10 :
                    n=n-7;
                    System.out.println(n  + " AS");
                    break;
                case 11 :
                    n=n-9;
                    System.out.println(n  + " MS");
                    break;
                case 0 :
                    n=n-11;
                    System.out.println(n  + " WS");
                    break;
            }
        }
    }
}
