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
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Weapon weapon =new BetterDevils();
       Armor armor = new Scorched();
       
       System.out.println(weapon.getName()
       +" Strikes for "+weapon.getAttackValue() + " Damage ");
       
         System.out.println(armor.getName()
       +" Defends for "+armor.getDefenseValue() + " Defends ");
    
    }
    
}
