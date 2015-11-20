/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelauncher;

/**
 *
 * @author Rene
 */
public class Player {
    int number = 0;
    String name;
    
    public void guess(){
        number = (int) (Math.random()*10);
        System.out.println("Im guessing "+ number);
    }

    @Override
    public String toString() {
        return "name = " + name;
    }
    
}
