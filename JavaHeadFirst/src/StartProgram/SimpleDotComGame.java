/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartProgram;

import java.util.ArrayList;
import java.util.Random;
import javax.management.Query;
import jdk.nashorn.internal.objects.NativeString;
import java.util.Scanner;
/**
 *
 * @author Rene
 */
public class SimpleDotComGame {  
    /**
     * @param args the command line arguments
     */  
  
   
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck d = new Duck();
        d.

        //page 260 
       
        //page 151
        /*                
        DotComBust game = new DotComBust();
        game.setUpGame();
        //game.StartPlaying();
        
       
        /* page 145
        *
        *
        GameHelper menu = new GameHelper();
        ArrayList<Integer> location = new ArrayList<>();
        Scanner input = new Scanner(System.in);
       
        int number = (int)(Math.random()* 5);
       
        DotCom dot = new  DotCom("Pets.com"); 
        DotCom dot1 = new DotCom("Go2.com");
        DotCom dot2 = new DotCom("Ask.com");
        
        location.add(number);        
        number = number+1;;        
        location.add(number);
        number++;        
        location.add(number);
       
        dot.setLocationCells(location);
        dot1.setLocationCells(location);
        dot2.setLocationCells(location);
        
        boolean run = true;
        while(run){
            String userGuess = menu.GetUserInput("Doe een gok en voer een getal in");
           
            String result = dot.checkYourself(userGuess);
            String testResult = "Helaas Mis!";
            try {
                if(result.equals("hit")){                
                testResult = "Raak!!";
            }else if(result.equals("kill")){
                testResult = "U heeft gewonnen! \n"
                        + "GAME OVER";
                System.out.println("Einde game!");
                run = false;
            }
            System.out.println("U heeft "+ userGuess+ " ingegeven en het resultaat is...");
            System.out.println(testResult);
            dot.getNumOfHits();
            } catch (Exception e) {
                System.out.println("Fout U dient een getal in te voeren "+ e);
            }
            
                        
        }
        dot.ShowNumberOfGuesses();
        
       
        
        // page 113      
        
        /* page 101
        Dog[] pets = new Dog[7];
        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[0].setSize(30);
        int x = pets[0].getSize();
        pets[1].setSize(8);
        pets[1].setName("fikkie");
        pets[1].setBreed("Vuilnisbakkie");
        pets[1].bark();
        System.out.println(pets[1].toString());
        
        
        /*
        GoodDog dog = new GoodDog();
        GoodDog dog1 = new GoodDog();
        GoodDog dog2 = new GoodDog();
        
        dog2.setSize(10);
        dog1.setSize(19);
        dog.setSize(20);
        
        dog2.bark();
        dog1.bark();
        dog.bark();
        
        
        /* page 98
        ElectricUuitar e = new  ElectricUuitar();
        e.setBrand("Strato Rock"); 
        e.setNumOfPickups(30);
        e.setRockStarUsesIt(true);
        System.out.println(e.toString());;
       
        
        
        
        /* page 97
        Song song = new Song();
        Song song1 = new Song();
        
        song.setArtis("Deep purple");
        song.setTitle("Smoke on the water");
        song1.setArtis("jimmy hendrix");
        song1.setTitle("all along the watchtower");
        
        song.play(3);
        //System.out.println(song1.toString()+ song.toString());
        
        /*
        // make a dog object and access it        
               
        // page 62 chapter 3
        Dog dog1 = new Dog();
        dog1.name = "Bart";
        dog1.bark();
        
        //Now make a dog arry
        Dog[] myDogs = new Dog[3];
        //and put som dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        
        //now access the dog using the array
        //references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        
        //mydogs[2] name is Bart
        System.out.println("The last dogs name is ");
        System.out.println(myDogs[2].name);
        
        //now loop through the array
        // and the all dogs to bark
        
        int x = 0;
        while(x < myDogs.length){
            //System.out.println(myDogs[x].name + " says ");
            myDogs[x].bark();
            x++;
        }
        
        
        /**
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