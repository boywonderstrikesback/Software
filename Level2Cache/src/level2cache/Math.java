/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level2cache;

/**
 *
 * @author mikeross
 */

 public class Math {
   

    public static String numberhex(int n) {
        String Hexvalue = Integer.toHexString(n);
	while(Hexvalue.length() < 8) {
		Hexvalue = "0" + Hexvalue;
	}
	return Hexvalue;
    }

    public static int hextonumber(String s) {
        String hex = "0123456789ABCDEF";
        s = s.toUpperCase();
        int changednumber = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = hex.indexOf(c);
            changednumber = 16*changednumber + d;
        }
        return changednumber ;
    }
} 


