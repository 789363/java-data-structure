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
public class t11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入月及日為：");
        int month=scanner.nextInt();
        int date=scanner.nextInt(); 
        System.out.println(get_con(month,date));
    }
    public static String get_con(int month,int date){
        int [] dates = {21, 19, 21, 21, 22, 22, 23, 24, 24, 24, 23, 22};
        String[] con ={"Capricorn 摩羯座", "Aquarius 水瓶座", " Pisces 雙魚座", "Aries 牡羊座", "Taurus 金牛座", "Gemini 雙子座", "Cancer 巨蟹座", "Leo 獅子座", "Virgo 處女座", "Libra 天秤座", "Scorpio 天蝎座", "Sagittarius 人馬座"};
        if (date < dates[month-1]) {
            return con[month-1]; 
        }
        else{
            return con[month] ;
        }
    }  
}
