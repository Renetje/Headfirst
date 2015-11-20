/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartProgram;

/**
 *
 * @author Rene
 */
public class Dog {
    String name;
    String breed;
    int size;
     
    void bark(){
        System.out.println("woef, woef");
    }    

    @Override
    public String toString() {
        return "Dog " + "name= " + name + ", breed= " + breed + ", size= " + size;
    }
    
}
