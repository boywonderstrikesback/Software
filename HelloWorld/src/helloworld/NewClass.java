/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author mikeross
 */
public class NewClass {
    public Integer numbers;

public NewClass(Integer start, Integer seconds){
    numbers = start + seconds;
}

public NewClass(Integer start){
    numbers = start;
}
    
public Integer getnumber(){
    return numbers;
}
  public void setNumber(Integer num){
      numbers=num+2;
  }
    
    
}