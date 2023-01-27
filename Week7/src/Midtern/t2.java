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
public class t2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("hallo");
        
        int input;
        String k;
        k = "輸入度數:";
        System.out.print(k);
        input= scanner.nextInt();
        if (input<=120)
        {          
            System.out.println("summer months"+input*2.10); 
            System.out.println("Non-summer months"+input*2.10);
            /*System.out.printf("Oh! I get %d!!", scanner.nextInt());*/
        } else if (input>120 && input<=330)
        {
            System.out.println("summer months"+(120*2.10+(input-120)*3.02)); 
            System.out.println("Non-summer months"+(120*2.10+(input-120)*2.68));
        }
        else if (input>330 && input<=500)
        {
            System.out.println("summer months"+(120*2.10+210*3.02+(input-330)*4.39));
            System.out.println("Non-summer months"+(120*2.10+210*2.68+(input-330)*3.61));
        }
        else if (input>500 && input<=700)
        {
           System.out.println("summer months"+(120*2.10+210*3.02+170*4.39+(input-500)*4.97)); 
           System.out.println("Non-summer months"+(120*2.10+210*2.68+170*3.61+(input-500)*4.01)); 
        }
        else if(input>700)
        {
            System.out.println("summer months"+(120*2.10+210*3.02+170*4.39+200*4.97+(input-700)*5.63)); 
            System.out.println("Non-summer months"+(120*2.10+210*2.68+170*3.61+200*4.01+(input-700)*4.50)); 
        }
        
        
        
    }
    
    

}
