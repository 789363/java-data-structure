/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Midtern;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class t5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("請輸入階乘值M:");
    int y=sc.nextInt();
    
    int n,i;
    n=i=1;
    while (i<=y)
    {
        i*=n;
        n+=1;
        
    }
    
    String x=Integer.toString(n-1);
    String m=Integer.toString(y);
    System.out.println("超過M為"+m+"的最小階層N值為:"+x);
    
            
    
    
    
    
    
    }
}
