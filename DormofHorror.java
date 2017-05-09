/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dormofhorror;

import cit260.dormofhorror.characters.Player;

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
       
    }
    
}
