package DormOfHorror;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import byui.cit260.DormOfHorror.model.Game;
import byui.cit260.DormOfHorror.model.Player;

/**
 *
 * @author Office Payne
 */
public class DormofHorror {

     
    public static void main(String[] args) {
       Player playerOne = new Player();
       
       playerOne.setName("Fred Flinstone");
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
       
       Game gameOne = new Game();
       
       gameOne.setTime(0);
       gameOne.setSanityPoints(100);
       
       String gameInfo = gameOne.toString();
       System.out.println(gameInfo);
    }
    
}
