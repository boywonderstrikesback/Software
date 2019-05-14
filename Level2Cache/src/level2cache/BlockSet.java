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
public class BlockSet {
    

    private int tag;
    private boolean isValid;
    private boolean isDirty;
    private int blocksize;
   
    private int[] Linesize;

   
    public BlockSet(int blocksize){
        isValid = false; // doesn't contain valid data yet
        isDirty = false; // doesn't need to be written back
       
        this.blocksize = blocksize;
        Linesize = new int[blocksize];
    }

   

   
     
    protected int read(int address) {
        return Linesize[ (address) % (blocksize) ];
    }

  
    public void write(int offset, int data) {
       
        Linesize[offset] = data;
        isValid = true;
        isDirty = true;
    }

  
    protected void writeBlock(int tag, int[] words) {
        this.tag = tag;
        this.Linesize = words;
        isValid = true;
        isDirty = false;
    }

   
    protected int[] readAllData() {
        return Linesize;
    }

   
    protected int getTag() {
        return tag;
    }

   
    protected boolean isValid() {
        return isValid;
    }

    
    protected boolean isDirty() {
        return isDirty;
    }

   
    @Override
    public String toString() {
        String result =  (isValid ? 1 : 0) + "        " + Math.numberhex(tag) + "   "
                + (isDirty ? 1 : 0) + "        ";
        for (int Line : Linesize)
            result += Math.numberhex(Line) + "     ";
        return result;
    }

}
