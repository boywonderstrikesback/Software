/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.Color;

public class user extends Person {
    private int number = 1;
    private int anotherNumber = 0;
    
    private  Role role;

    @Override
    public String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getLastName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getIntial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isAdmin(){
        boolean isAdmin = false;
        
        if(number == 1 && anotherNumber == 0){
            isAdmin= true;
        }
        if(number == 0 || number == 1){
             isAdmin= true;
        }
        return isAdmin;
    }

  
}