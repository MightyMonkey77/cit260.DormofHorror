/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DormofHorror.view.StartProgram;

import byui.cit260.DormofHorror.control.GameControl.GameControl;
import dormofhorror.DormofHorror;
import java.util.Scanner;

/**
 *
 * @author Office Payne
 */
public class MainMenuView {
           
    private final String menu;

    public MainMenuView() {
        this.menu = "\n"
                  + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++"
                  + "\n| Main Menu                                           |"
                  + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++"
                  + "\nN - Start New Game"
                  + "\nG - Return to Game from a save"
                  + "\nH - Help Menu"
                  + "\nS - Save your game"
                  + "\nQ - Quit your current game session"
                  + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++";
    }
      public void displayMainMenuView() {
        boolean done = false;
        do {
            //prompt for option and name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //quit function
                return; // exits the game
            
            done = this.doAction(menuOption);
            
        }
        while (!done);
    }
    
    private String getMenuOption() {
          Scanner keyboard = new Scanner(System.in); //get infile from keyboard
        String value = "";
      
        boolean validated = false;
        
       while (!validated) {
            System.out.println("\n Input Menu option." );
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 0) {
                
                System.out.println("\nInvalid value: Cannot be blank.");
                continue;
            }
            break; // ends the loop
            }
        return value;
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N": //Start New game
                this.startNewGame();
                break;
            case "G": //return to saved game
                this.startExistingGame();
                break;
            case "H": //Help menu
                this.displayHelpMenu();
                break;
            case "S": // Saves your current game
                this.saveGame();
                break;
            
            default:
                System.out.println("\n Invalid selection. Try again.");
                break;
        }
        return false;
    }

    private void startNewGame() {
        //Creation of new game
       GameControl.createNewGame(DormofHorror.getPlayer());
       //Fetching the game menu
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("G-Saved Game Return");
    }

    private void displayHelpMenu() {
        System.out.println("H-Help Menu"); 
    }

    private void saveGame() {
         System.out.println("S-Save Current Game");
    }

}
   
