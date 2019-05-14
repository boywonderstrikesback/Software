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
public abstract class Weapon implements Equipment {
    public abstract Integer getAttackValue();
    public Integer getAttackSpeed(){
        return 1;
    }
}
