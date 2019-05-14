/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.Random;

/**
 *
 * @author mikeross
 */
public class RandomO {
   RandomO randomO=new RandomO();
    
    Random rand = new Random(); 
    int RandomNumber;

    public RandomO() {
        this.RandomNumber = rand.nextInt(100);
    }
    
    public Integer getRandomNumber() {
        return RandomNumber;
    }

    public void setRandomNumber(int RandomNumber) {
        this.RandomNumber = RandomNumber;
    }

   
}
