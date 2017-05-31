/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DormofHorror.control.GameControl;

import byui.cit260.DormofHorror.model.Characters.Player;
import dormofhorror.DormofHorror;

/**
 *
 * @author Office Payne
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;          
        }
        
        Player player = new Player();
        player.setName(name);
        
        DormofHorror.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("Future Home of new Game Creation");
    }
    
}
