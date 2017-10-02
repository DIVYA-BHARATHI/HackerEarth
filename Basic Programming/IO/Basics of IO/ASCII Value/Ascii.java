import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
 
public class Ascii
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char a = (char) br.read();
        int c = a;
        System.out.println(c);
    }
}
