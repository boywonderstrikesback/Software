/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author mikeross
 */
public class HelloWorld {

    
    private static NewClass secondClass = new NewClass(5,3);
    private static NewClass thirdClass = new NewClass(5,1);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HelloWorld main = new HelloWorld();
    
        main.print(secondClass);
        main.print(thirdClass);
        main.thirdClass.setNumber(45);
        main.print(main.thirdClass);
    
    }
   
    
    public static void test(){
        Integer num=10;
        secondClass.setNumber(num);
        
    }
   private static void print(NewClass classToPrint){
       System.out.println(classToPrint.getnumber());
   }
   
    } 


        
       
