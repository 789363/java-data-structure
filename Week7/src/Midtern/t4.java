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
public class t4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x,y,s;
    System.out.print("X軸座標:");
    x=sc.nextInt();
    System.out.print("Y軸座標:");
    y=sc.nextInt();
    s=(int)(Math.pow(x,2)+Math.pow(y,2));
    String z=Integer.toString(s);
    if (x==0 && y==0){
        System.out.println("該點位於原點");
    }
    else if (x>0 && y==0){
        System.out.println("該點位於右半平面X軸上，離原點距離為根號"+(z));
    }
    else if (x<0 && y==0){
        System.out.println("該點位於左半平面X軸上，離原點距離為根號"+(z));
    }
    else if (x==0 && y>0){
        System.out.println("該點位於上半平面Y軸上，離原點距離為根號"+(z));
    }
    else if (x==0 && y<0){
        System.out.println("該點位於下半平面Y軸上，離原點距離為根號"+(z));
    }
    else if (x>0 && y>0){
        System.out.println("該點位於第一象限，離原點距離為根號"+(z));
    }
    else if (x<0 && y>0){
        System.out.println("該點位於第二象限，離原點距離為根號"+(z));
    }
    else if (x<0 && y<0){
        System.out.println("該點位於第三象限，離原點距離為根號"+(z));
    }
    else if (x>0 && y<0){
        System.out.println("該點位於第四象限，離原點距離為根號"+(z));
    }
    

}
    
    
    
    
    
}
