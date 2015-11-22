/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartProgram;

/**
 *
 * @author Rene
 * 
 */
public class Movie {
    private String title;
    private String genre;
    private int rating;
    
    

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
    
    public void playIt(){
        System.out.println("Playing the movie \n"+ title);
    }

    @Override
    public String toString() {
        return "Movie " + "title= " + title + ",\n genre= " + genre + ",\n rating= " + rating + "\n";
    }
    
}
