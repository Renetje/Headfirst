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
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        p1.name = "Player 1";
        p2.name = "Player 2";
        p3.name = "Player 3";
        
        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;
        
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9");
        
        while(true){
            System.out.println("Number to guess is "+ targetNumber);
            
            p1.guess();
            p2.guess();
            p3.guess();
            
            guessP1 = p1.number;
            System.out.println("Player one guessed "+ guessP1);
            guessP2 = p2.number;
            System.out.println("Player two guessed "+ guessP2);
            guessP3 = p3.number;
            System.out.println("Player tree guessed "+ guessP3);
            
            if(guessP1 == targetNumber){
                p1isRight = true;
                
                
            }
            if(guessP2 == targetNumber){
                p2isRight = true;
                
                
            }
            if(guessP3 == targetNumber){
                p3isRight = true;
                
            }
            if(p1isRight||p2isRight||p3isRight){
                System.out.println("And the winner is: "+ p3);
                System.out.println("And the winner is: "+ p2);
                System.out.println("And the winner is: " + p1);
                break;
            }
            else{
                System.out.println("Players will have to try again");
            }
        }
    }
}
