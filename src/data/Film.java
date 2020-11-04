/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author RYP
 */
   public class Film {
    public String filmName;
    public String filmGenre;
    public Double filmRating;
    public int filmDuration;
    
    public void nowPlaying(){
       
       System.out.println("Judul Film : " + this.filmName);
       System.out.println("Genre Film : " + this.filmGenre);
       System.out.println("Rating Film : " + this.filmRating);
       System.out.println("Duration Film : " + this.filmDuration + " Menit ");
       System.out.println("");
    }
}
