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
public class t18 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("輸入一字串為:");
    String a=sc.next();
    String b=sc.next();
    String c=sc.next();
    if (a=="O" && b=="O" && c=="O"){
        System.out.print("Yes");}
    else if (a=="A" && b=="O" &&(c=="A"||c=="O")){
        System.out.print("Yes");}
    else if (a=="B" && b=="A" &&(c=="B"|| c=="O")){
        System.out.print("Yes");}
    else if (a=="O" && b=="AB" &&(c=="A"|| c=="B")){
        System.out.print("Yes");}
    else if (a=="A" && b=="A" &&(c=="A"|| c=="O")){
        System.out.print("Yes");}
    else if (a=="A" && b=="B"){
        System.out.print("Yes");}
    else if (a=="A" && b=="AB" &&(c=="A"|| c=="B"|| c=="AB")){
        System.out.print("Yes");}
    else if (a=="B" && b=="B" &&(c=="B"|| c=="O")){
        System.out.print("Yes");}
    else if (a=="B" && b=="AB" &&(c=="A"|| c=="B"|| c=="AB")){
        System.out.print("Yes");}
    else if (a=="AB" && b=="AB" &&(c=="A"||c=="B"||c=="AB")){
        System.out.print("Yes");}
    else{
        System.out.print("impossible");}
            }
}
