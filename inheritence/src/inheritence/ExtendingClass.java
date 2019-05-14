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
public class ExtendingClass extends BaseClass{
    @Override
    public Integer getNumber()
    {
        return super.getNumber() * 2;
    }

 public  void printNumber(){
    System.out.println(getNumber());
}



}
