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
public class Scorched extends Armor{

    @Override
    public Integer getDefenseValue() {
       return 5; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getDurability() {
       return 35; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getValue() {
       return 3400; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getColor() {
       return new Color (255,0,255); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return "Scorched Armor"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
