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
public class t3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y;
        String k;
        k = "輸入年:";
        System.out.print(k);
        y = scanner.nextInt();
        if (y%12==6)
        {
            System.out.println("tigger");
        }
        else if(y%12==5)
        {
            System.out.println("ox");
        }
        else if(y%12==4)
        {
            System.out.println("rat");
        }
        else if(y%12==7)
        {
            System.out.println("rabbit");
        }
        else if(y%12==8)
        {
            System.out.println("dragon");
        }
        else if(y%12==9)
        {
            System.out.println("snake");
        }
        else if(y%12==10)
        {
            System.out.println("horse");
        }
        else if(y%12==11)
        {
            System.out.println("sheep");
        }
        else if(y%12==0)
        {
            System.out.println("monkey");
        }
        else if(y%12==1)
        {
            System.out.println("rooster");
        }
        else if(y%12==2)
        {
            System.out.println("dog");
        }
        else if(y%12==4)
        {
            System.out.println("pig");
        }
    }
}
