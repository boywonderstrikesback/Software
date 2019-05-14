/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;

/**
 *
 * @author mikeross
 */
public class Sword extends Weapon {

    @Override
    public Integer getAttackValue() {
        return 256;
    }


    @Override
    public Integer getDurability() {
       return 10;
    }

    @Override
    public Integer getValue() {
        return 34000;
    }

    @Override
    public Color getColor() {
      return new Color(134,0,0);
    }

    @Override
    public String getName() {
    return "Sina's Wrath";
    }
    
}
