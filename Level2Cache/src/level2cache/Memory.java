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

 public class Memory{
    static int dataSIZE = 4194304;
    int[] data;
    
    public Memory() {
        data = new int[dataSIZE];
        for (int i = 0; i < data.length; i++)
            data[i] = i; 
    }

    public int read(int address) {
        return data[address];
    }

    public void write(int address, int value) {
        data[address] = value;
    }

    public  void print() {
        System.out.println( "MAIN MEMORY:" );
        System.out.println( "Address    Words " );
        for (int i = 0; i < 128; i++) {
            System.out.print(Math.numberhex(4161280 + i * 0x8) + " ");
            for (int j = 0; j < 8; j++)
                System.out.print(Math.numberhex( data [i*8 + j + 4161280] ) + " " );
            System.out.println();
        }
    }
}

  

