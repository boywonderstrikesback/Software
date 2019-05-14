/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mikeross
 */
public class RandomNumbers2 {
   
    private Integer randomNumber;
    private String randomNumbers;
    private String [] BingoNumbers;
    List <Integer> RandomGenerator = new ArrayList();
    
     
    public RandomNumbers2(){
  
        for (int i = 0; i< 75; i++){
            RandomGenerator.add(i+1);
            System.out.print(RandomGenerator.get(i));
        }
        Collections.shuffle(RandomGenerator);
        
        randomNumber = RandomGenerator.remove(0);
        if (randomNumber < 16){
            randomNumbers = "B" + randomNumber.toString();
        }
        
        else if (randomNumber >=16 && randomNumber < 31){
            randomNumbers = "I" + randomNumber.toString();
        }
        
        else if (randomNumber >=31 && randomNumber < 46){
            randomNumbers = "N" + randomNumber.toString();
        }
        
        else if (randomNumber >=46 && randomNumber < 61){
            randomNumbers = "G" + randomNumber.toString();
        }
        
        else if (randomNumber >=61 && randomNumber < 76){
            randomNumbers = "O" + randomNumber.toString();
        }
    }

    public String getRandomNumbers() {
        return randomNumbers;
    }

}
