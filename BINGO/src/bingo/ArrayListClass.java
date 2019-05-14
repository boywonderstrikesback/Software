
package bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author mikeross
 */
public class ArrayListClass {

private Integer randomNumber;
    private String randomNumberList;
    private String [] BingoNumbers;
    List <Integer> RandomGenerator = new ArrayList();
    
     
    public ArrayListClass (){
  
        for (int i = 0; i< 75; i++){
            RandomGenerator.add(i+1);
            System.out.print(RandomGenerator.get(i));
        }
        Collections.shuffle(RandomGenerator);
        
        randomNumber = RandomGenerator.remove(0);
        if (randomNumber < 16){
            randomNumberList = "B" + randomNumber.toString();
        }
        
        else if (randomNumber >=16 && randomNumber < 31){
            randomNumberList = "I" + randomNumber.toString();
        }
        
        else if (randomNumber >=31 && randomNumber < 46){
            randomNumberList = "N" + randomNumber.toString();
        }
        
        else if (randomNumber >=46 && randomNumber < 61){
            randomNumberList = "G" + randomNumber.toString();
        }
        
        else if (randomNumber >=61 && randomNumber < 76){
            randomNumberList = "O" + randomNumber.toString();
        }
    }

    public String getRandomNumbers() {
        return randomNumberList;
    }
}
    
    