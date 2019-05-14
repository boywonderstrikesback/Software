/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.Color;

/**
 *
 * @author mikeross
 */
import java.util.UUID;

public class Book {
    private UUID id;
    private String firstName;
    private String lastName;
    
    public Book (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = UUID.randomUUID();
    }
    
    @Override
    public String toString() {
        return this.id.toString() + " " +
               this.firstName + " " +
               this.lastName;
    }
}