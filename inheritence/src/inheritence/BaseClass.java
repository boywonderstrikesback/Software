/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author mikeross
 */
public abstract class BaseClass {
    private Integer number;
    
    
    public Integer getNumber(){
        return number;
    }
public void setNumber(Integer number){
    this.number=number;
}

    void printNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
