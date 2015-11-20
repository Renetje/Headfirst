/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartProgram;

import javax.management.Query;

/**
 *
 * @author Rene
 */
public class JavaApplication17 {
    

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        Dog[] pets = new Dog[3];
        
        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[2] = new Dog();
        
        pets[0].name = "fiffy";
        pets[0].breed = "Hound";
        pets[0].size = 10;
        
        pets[1].name = "Rakker";
        pets[1].breed = "Vuilnis";
        pets[1].size = 8;
        
        pets[2].name = "Lobbes";
        pets[2].breed = "Sintbernard";
        pets[2].size = 15;
        
        System.out.println(pets[0].toString()+ 
                " \n" + pets[1].toString()+
                "\n" + pets[2].toString());
        
        /**
        Movie one = new Movie();
        one.setTitle("Gone with the wind");
        one.setGenre("Tradic");
        one.setRating(-2);        
        
        Movie two = new Movie();
        two.setTitle("Scarface");
        two.setGenre("Crime");
        two.setRating(5);
        two.playIt();
        Movie tree = new Movie();
        tree.setTitle("Pulp fiction");
        tree.setGenre("Crime");
        tree.setRating(5);
        
        //System.out.println(one.toString()+ two.toString() + tree.toString());
        
        
        Dog d = new Dog();
        d.size = 40;
        d.bark();
        
        
        /**
        int x = 0;
        while(x < 4 ){
            System.out.println("a");            
            if(x < 1){
                System.out.println(" ");
            }
            x = x + 2;
            if(x > 1){
                System.out.println("n");
                System.out.println("oise");
                x = x + 1;
            }
            if(x == 1){
                System.out.println("annoys");
            }
            if(x < 4 ){
                System.out.println("an");
            }
            System.out.println("");
            x = x - 2;
                
        }
        
        /**
        int x = 0;
        int y = 0;
        while(x < 5){
           if(y <5){
               x = x +1;
               if(y < 3){
                   x = x -1;
               }
           }
           y = y + 2;    
            System.out.println(x + " " + y + " ");
            x = x + 1;
        }
        
        
        //Another code
        int x = 3;
        while (x > 0){
            if(x > 2){
                System.out.println("a");
            }
            if(x == 2){
                System.out.println("b, c");
            }
            if(x == 1){
                System.out.println("d");
            }
            x = x -1;
            System.out.println("-");
        }        
        /**
        // Another code
        String[] wordListOne = {
            "24/7", "multiTier", "30,000 foot", "B-to-B", "win, win",
            "frond-end", "web-based", "pervasive", "smart", "sixsigma",
            "critical-path", "dynamic"
            };
            String[] wordListTwo= {
            "empowerd", "sticky", "value-added", "oriented", "centric", "dirtibuted",
            "clusterd", "branded", "oudside-the-box", "positioned", "networked", 
            "focused", "levaraged", "alingend", "targeted", "shard", "cooperative", "accelerated"
            };
            String[] wordListTree= {"process", "tipping-point", "solution", "architecture", "core competency",
                "strategy", "mindeshare", "portal", "space", "vision", "paradigm", "mission"
            };
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int treeLength = wordListTree.length;
        
        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * treeLength);
        
        String phrase = wordListOne[rand1] + "  " + wordListTwo[rand2] + " " + wordListTree[rand3];
        System.out.println("What we need is a " + phrase);
        
        // First code
        int beerNumber = 99;
        String word = "Bottles";
        while(beerNumber > 0){
            if(beerNumber == 1){
                word = "bottle";
            }
            System.out.println(beerNumber + " " + word + " of beer on the wall");
            System.out.println(beerNumber + " " + word + " of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNumber = beerNumber -1;
            
            if(beerNumber == 0){
                //System.out.println(beerNumber + " " + word + " of beer on the wall");
                System.out.println("No more bottles of beer on the wall");
            }
           
        } // end while loop
        */
    } // ends main method
}// //end class