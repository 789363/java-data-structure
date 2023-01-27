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
public class t1 {
 private static boolean isPrime(String s) {
        if (s == "") return false;
        int num = Integer.parseInt(s);
        for (int i=2; i<num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    private static String findPrime(String s) {
        String maxSubString = "-1";

        for (int i=0; i<=s.length(); i++) {
            for (int j=i+1; j<= s.length(); j++) {
                String subString = s.substring(i, j);
                if (isPrime(subString)) {
                    // 比較最大的子字串與當前子字串大小
                    maxSubString = String.valueOf(Math.max(Integer.parseInt(maxSubString), Integer.parseInt(subString)));
                }
            }
        }
        if (maxSubString == "-1") return "No prime found";
        return maxSubString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(findPrime(scanner.nextLine()));
    }
    

}
