/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author mikeross
 */
public class BetterDevils extends Weapon {

    @Override
    public Integer getAttackValue() {
         Random rand = new Random();
        return 5 +rand.nextInt(35);
    }

    @Override
    public Integer getDurability() {
       return 45; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getValue() {
        return 345; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getColor() {
        return new Color (255,0,255); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return "Better Devils";  //To change body of generated methods, choose Tools | Templates.
    }
    
}
