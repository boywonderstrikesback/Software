/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordscramble;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mikeross
 */
public class getFunction {
    
    
  public List getInteger(){
  ArrayList<Character> Number1to10 = new ArrayList();
   for (int i = 47; i<= 57; i++){
     Number1to10.add((char)i);
   }
   
   return Number1to10;
}


public List getLowerCase(){
  ArrayList<Character> LowerCase = new ArrayList();
   for (int i = 97; i<= 122; i++){
     LowerCase.add((char)i);
   }
   
   return LowerCase;
}

public List getUpperCase(){
  ArrayList<Character> upperCase = new ArrayList();
   for (int i = 65; i<= 90; i++){
     upperCase.add((char)i);
   }
   
   return upperCase;
}

public List getSymbols(){
  ArrayList<Character> Symbols = new ArrayList();
   for (int i = 224; i<= 239; i++){
     Symbols.add((char)i);
   }
   
   return Symbols;
}

public List getASCII(){
  ArrayList<Character> ASCII = new ArrayList();
   for (int i = 128; i<= 180; i++){
     ASCII.add((char)i);
   }
   
   return ASCII;
}
}
