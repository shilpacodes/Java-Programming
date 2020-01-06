/**********************
* Lab 02
* This program shuffles an array of songs and plays 10 different songs
* Author : Shilpa Kannan
* Date : 01/28/2019
**********************/

import java.util.Random; //Imports Random class

public class PlaylistShuffler{ //Class
  
   public static void main (String [] args){ //Main method
      
      // Delcare and initializes the variables
        int i = 0; //index 
        int count = 0;
      
      // Declares and assigns all the songs to the String array
        String [] songs = {"Without Me","Thank U, Next", "Sicko Mode",
         "High Hopes", "Happier", "Girls Like You", "Drip Too Hard", "Eastside", "Zeze", "Wow", "Wake Up in the Sky",
          "Better Now", "Mo Bamba", "Breathin"};
      
      //Creating an object of the Random class
        Random num = new Random();
      
      //Loop for printing out 10 songs
        while(count <10){
        
          i = num.nextInt(14);
          System.out.println(i); // Assigns a random number between 0 and 14 to the index
             
          if(!(songs[i].equals("played"))){ // Checks if the song has been played once
            System.out.println(songs[i]); // Prints out or plays the song at index i
            songs[i] = "played"; // Confirms that the song has been played once
            count++; // number of songs in the array increases by 1
          }
          
        }
     
   }
}