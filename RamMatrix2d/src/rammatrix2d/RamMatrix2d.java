/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rammatrix2d;

/**
 *
 * @author mikeross
 */
public class RamMatrix2d {
   int Row;             // number of rows
   int Columns;             // number of columns
   int N; 
       double [][] dest;   
          double [][] original;

    /**
     * @param args the command line arguments
     */
    
    public RamMatrix2d(double[][] dest, double[][] original){

        for (int Columns = 0; Columns < N; Columns++)
            for (int Row = 0; Row < N; Row++)
                    dest [Row][Columns] = original[Row][Columns];
  
        
    }   

    
    public static void main(String[] args) {
           System.out.print("time in nanoseconds = ");
      System.out.println(System.nanoTime());

      // returns the current value of the system timer, in milliseconds
      System.out.print("time in milliseconds = ");
      System.out.println(System.currentTimeMillis());
        



// TODO code application logic here
    }
    
}
