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
public interface Equipment {
    
    Integer getDurability();
    Integer getValue();
    Color getColor();
    String getName();
}
