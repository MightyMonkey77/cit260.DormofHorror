/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DormofHorror.view.StartProgram;

import byui.cit260.DormofHorror.control.GameControl.GameControl;
import byui.cit260.DormofHorror.model.Characters.Player;
import java.util.Scanner;

/**
 *
 * @author Office Payne
 */
public class StartGame {
    
    private final String promptMessage;
    private boolean valid;

    public StartGame() {
        
        this.promptMessage = "\nEnter your name: ";
        // display banner when view is created.
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println("\n**************************************************"
                         + "\nWelcome to Dorm of Horrors....."
                         + "\nYou are invited to an old friends dormitory for a"
                         + "\nnight of games and to catch up on old times. You "
                         + "\nquickly learn that not all is aright with this "
                         + "\ndormoitory. You will need to find objects scattered"
                         + "\nthroughout 6 dorm rooms in order to escape. Collecting "
                         + "\nthese will help you to solve three equations that will"
                         + "\nlead you out of the dormitory "
                         + "\n"
                         + "\nAs you go through the game and collect clues you "
                         + "\nshould have a scrap piece of paper with you in order to"
                         + "\nwrite the clues down. This way you will be able to keep"
                         + "\ntrack.");
        
        
    }

    public void displayStartGame()  {
        
        @SuppressWarnings("UnusedAssignment")
        boolean done = false;
        do {
            //get player name by prompt
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // shows the user quitting option
                return;
            
            //do the request and display the next action
            done = this.doAction(playersName);
           }
        while (!done);
    }

      private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); //get infile from keyboard
        String value = "";
      
        boolean validated = false;
        
       while (!validated) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                
                System.out.println("\nInvalid value: Cannot be blank.");
                continue;
            }
            break; // ends the loop
            }
        return value; 
    
   }
    
    private boolean doAction(String playersName) {
      if (playersName.length() < 2){
          System.out.println("\nInvalid player name"
          + " The player name must be greater than one character in length.");
          return false;
         }
      
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { //if unsuccesfull.
            System.out.println("\nError creating the player.");
            return false;  
        }
      
        
        this.displayNextView(player);
        return true; //success
    }

    private void displayNextView(Player player) {
                System.out.println("\n ================================================="
                         + "\n Welcome to the Dorm of Horrors " + player.getName()
                         + "\n Collect your item/clues and solve the puzzels"
                         + "\n =================================================");
        
        MainMenuView mainMenuView = new MainMenuView();
        // Main menuy object        
        mainMenuView.displayMainMenuView();
        }
       
    }

  

    