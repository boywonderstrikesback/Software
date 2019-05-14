/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level2cache;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mikeross
 */
public class Level2Cache {


  public static void main(String args[]){
       
        try{
      String file ="/Users/mikeross/Desktop/addresses.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int total =0;
            
            String passone=null;
         
            while((passone = reader.readLine()) != null)
            {total++;}
            
            
            System.out.println("Level1: ");
            String[][] operater = new String[total][3];
            
            BufferedReader reader2=new BufferedReader(new FileReader(file));
            String passtwo=null;
            int Loca=1024;
            int i=0;
            String operate;
            while((passtwo=reader2.readLine()) != null){
                if ((passtwo.length()) <=4)
                    
                    operate = " ";
                
                else
                { operate=passtwo.substring(5);}
                
                String binary= Integer.toBinaryString(Loca);
                String dex= Integer.toString(Loca);
                operater[i][0]=dex;
                operater[i][1]=operate;
                operater[i][2]=binary;
                Loca--;
                i++;
            }
            int l=0;
            
            System.out.println("Cache\t"+"a\t"+"b\t");
            
            while(l < total){
                
                System.out.print(operater[l][0]);
                
                System.out.print("\t");
                
                System.out.print(operater[l][1]);
                          
                System.out.print("\t");
                
                System.out.println(operater[l][2]);
                
                l++;}
            System.out.println("Level2 : ");
            String[] [] opco= new String[][]{
                
                {"0000", ""},
                {"0001", ""},
                {"0010", ""},
                {"1110", ""},
                {"0011", ""},
                {"0100", ""},
                {"0101", ""},
                {"0110", ""},
                {"0111", ""},
                {"1000", ""},
                {"1001", ""},
                {"1010", ""},
                {"1011", ""},
                {"1100", ""},
                {"1101", ""},
                {"1111000000000000", ""},
                {"1111001000000000", ""},
                {"1111010000000000", ""},
                {"1111011000000000", ""},
                {"1111100000000000", ""},
                {"1111101000000000",""},
                {"11111100",""},
                {"11111110", ""}};
            BufferedReader reader3= new BufferedReader(new FileReader(file));
          try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
              String OPC;
              String line="  ";
              int c=0;
              
              while ((passone=reader3.readLine()) != null)
              {if ((passone.length()) <8){
                  OPC=passone.substring(0);}
              else {OPC=passone.substring(4,4);}
              
              System.out.print(OPC);
              System.out.print("\t");
              
              
              writer.write(line);
              String op = operater[c][2];
              
              c++;
              System.out.println(line);
              writer.write(op);
              writer.newLine();
              }
          }
        }

  }

      catch (IOException e){ System.out.println("(0)Catch");}

         }

  

}


    
