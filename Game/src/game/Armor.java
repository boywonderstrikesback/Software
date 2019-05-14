/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author mikeross
 */
public abstract class Armor implements Equipment {
    public abstract Integer getDefenseValue();
    public Integer getDefenseSpeed(){
        return 1;
    }
}

