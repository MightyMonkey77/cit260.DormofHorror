/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dormofhorror;

import byui.cit260.DormofHorror.model.Characters.Player;
import byui.cit260.DormofHorror.model.Game.Game;
import byui.cit260.DormofHorror.view.StartProgram.EquationView;
import byui.cit260.DormofHorror.view.StartProgram.StartGame;


/*
 * Update 6/5/17 I do not have any teammates yet I still have to do team work
 * and continue this all alone. Woot!!!!!
 * @author Office Payne
 */
public class DormofHorror {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        DormofHorror.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DormofHorror.player = player;
    }
    
    

      //Not sure what to do with coordinates at this time.
    public static void main(String[] args) {
        // System Objects
        StartGame startGame = new StartGame();
        startGame.displayStartGame();
       
        
    
       
    }


}
