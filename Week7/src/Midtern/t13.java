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
public class t13 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入一字元為：");
        String str=scanner.next();   
        StringBuilder sb = new StringBuilder(str);
        String str2;
		str2 = sb.reverse().toString();
        if(str2.contains(str)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
