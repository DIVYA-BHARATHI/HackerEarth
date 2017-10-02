import java.io.*;
 
public class ToggleCase{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(ir);
        String t = b.readLine();
        char[] c = t.toCharArray();
        int n = t.length();
        for(int i=0;i<n;i++){
            char s = c[i];
            if(Character.isLowerCase(s))
                c[i] = Character.toUpperCase(s);
            if(Character.isUpperCase(s))
                c[i] = Character.toLowerCase(s);
        }
        for(int i=0;i<n;i++)
        System.out.print(c[i]);
    }
}
