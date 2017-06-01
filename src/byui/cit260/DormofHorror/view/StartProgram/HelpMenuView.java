/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DormofHorror.view.StartProgram;

import java.util.Scanner;

/**
 *
 * @author Office Payne
 */
public class HelpMenuView {
    
    private final String helpMenu;

    public HelpMenuView() {
        this.helpMenu = "\n"
                  + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++"
                  + "\n| Help Menu                                          |"
                  + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++"
                  + "\nC - Clue gathering instructions"
                  + "\nG - Goal of the Game"
                  + "\nE - Solving Equations"
                  + "\nM - Movement of the Game"
                  + "\nQ - Quit the Help Menu"
                  + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++";
    }
      public void displayHelpMenuView() {
          System.out.println(helpMenu);
        boolean done = false;
        do {
            //prompt for option and name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //quits the help menu.
                return; // exits the menu
            
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
            case "C": //Help for clue gathering
                this.clueGatheringHelp();
                break;
            case "G": //Help on the goal of the game
                this.goalOfTheGame();
                break;
            case "E": //Help on solving equations. What to do's
                this.solvingEquationHelp();
                break;
            case "M": // Help on movment
                this.movementInGame();
                break;
            
            default:
                System.out.println("\n Invalid selection. Try again.");
                break;
        }
        return true;
    }

    private void clueGatheringHelp() {
        System.out.println("Future home of the clue help");
    }

    private void goalOfTheGame() {
        System.out.println("Future home of the goal of the game help");
    }

    private void solvingEquationHelp() {
        System.out.println("Future home of the equation help");
    }

    private void movementInGame() {
        System.out.println("Future home of the movement help");
    }

   
}
