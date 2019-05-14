/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rammatrix;

import static javafx.scene.input.KeyCode.N;
import static javax.swing.text.html.HTML.Attribute.N;

/**
 *
 * @author mikeross
 */
public class RamMatrix {
   int Row;             // number of rows
   int Columns;             // number of columns
   int N; 
       double [][] dest;   
          double [][] original;

    /**
     * @param args the command line arguments
     */
    
    public RamMatrix(double[][] dest, double[][] original){

        for (int Row = 0; Row < N; Row++)
            for (int Columns = 0; Columns < N; Columns++)
                    dest [Row][Columns] = original[Row][Columns];
    
        System.out.println(original);
        System.out.println(dest);
    }   
   
   
   
    
  
    public static void main(String args[]) {
 // returns the current value of the system timer, in nanoseconds
      System.out.print("time in nanoseconds = ");
      System.out.println(System.nanoTime());

      // returns the current value of the system timer, in milliseconds
      System.out.print("time in milliseconds = ");
      System.out.println(System.currentTimeMillis());
    
    
    
    }
}
