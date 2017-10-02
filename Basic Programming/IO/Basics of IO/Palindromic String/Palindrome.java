import java.io.*;
import java.util.*;
 
public class Palindrome
{
    public static void main(String args[]) throws Exception
    {
        try{
        Scanner s = new Scanner(System.in);
        String original = s.nextLine();
        String rev = "";
        //System.out.println(original);
        //System.out.println(rev);
        int length = original.length();
        for(int i = length-1; i>=0; i--)
            rev = rev + original.charAt(i);
        //System.out.println(rev);
        if(original.equals(rev))
            System.out.println("YES");
        else
            System.out.println("NO");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
    }
}
Language: Java 8
