/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Midtern;

/**
 *
 * @author Wei
 */
import java.util.Scanner;
public class t9 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入s1為：");
        String s1=scanner.next();
        System.out.print("輸入s2為：：");
        String s2=scanner.next();
        if(s2.contains(s1)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }    
}
