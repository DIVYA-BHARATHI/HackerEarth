import java.io.*;
import java.util.*;
 
public class PrimeNumber
{
    public static void main(String args[]) throws Exception
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int flag = 0;
        int i,j;
        System.out.print("2 ");
        
        
        for(i = 1; i <= n; i++)
        {
                      for(j = 2; j < i; j++)
                      {
                          if(i % j == 0)
                          {
                              flag = 0;
                              break;
                              
                          }
                          else
                            flag = 1;
                        
                      }
                      if(flag == 1)
                          {
                              System.out.print(i + " ");
                          }
                          
                      }
        }
    }  
    
