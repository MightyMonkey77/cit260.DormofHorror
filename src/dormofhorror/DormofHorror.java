/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dormofhorror;

import byui.cit260.DormofHorror.model.Characters.Player;
import byui.cit260.DormofHorror.model.ActingJob.Actor;
import byui.cit260.DormofHorror.model.Game.Game;
import byui.cit260.DormofHorror.model.InventoryClass.Inventory;
import byui.cit260.DormofHorror.model.LocationClass.Location;
import byui.cit260.DormofHorror.model.MapClass.Map;
import byui.cit260.DormofHorror.model.Mathematics.Math;
import byui.cit260.DormofHorror.model.RegularSceneClass.RegularScene;
import byui.cit260.DormofHorror.model.Tip.ClueScene;
import byui.cit260.DormofHorror.model.Tip_and_Math.tipandmath;
import byui.cit260.DormofHorror.model.Resource.Resource;
/**
 * Associates: Camren, Tinker Ricardo, Herrera Daryl Payne
 * Camren responsibility: Game, Regular Scene and Location classes
 * Ricardo responsibility: Inventory, Resources and Map
 * Daryl responsibility: Actor, Clue, Equation and Clue&Equation
 * 
 * @author Office Payne
 */
public class DormofHorror {

      //Not sure what to do with coordinates at this time.
    public static void main(String[] args) {
       Player playerOne = new Player();
       Actor actorOne = new Actor();
       Math equationsOne = new Math();
       Math answersOne = new Math();
       ClueScene cluesOne = new ClueScene();
       tipandmath clueByLocationOne = new tipandmath();
       tipandmath equationByLocationOne = new tipandmath();
       Resource itemOne = new Resource();
       Inventory backpack = new Inventory();
       Map dormLayout = new Map();
       Game gameOne = new Game();
       Location roomOne = new Location();
       RegularScene regularSceneOne = new RegularScene();
      
       
       playerOne.setName("Fred Flinstone");
       actorOne.setName ("George Binazowski");
       actorOne.setDescription("You have been invited to spend an evening at a party"
               + "\nhosted by your friend Jack Clawsen, at his Dorm room. You eagerly accept"
               + "\nhis invitation. You have not seen him since you were in grade school together."
               + "\nYou make the hour long drive using the sirection provided to arrive at what "
               + "\nappears to be a rundown set of dorms. You think, 'meh! Stayed in worse' and walk "
               + "\ninto and up to his room. You knock and are greated by Jack with a hearty hello "
               + "\nand a handshake. He asks how you have been and reminisces about the past. He  "
               + "\nteases you about how much of a scardy cat you were. After an hour passes he "
               + "\nexcuses himself and says he needs to check on another friend in another room to "
               + "\nsee why they have not come over yet. After he is gone for 10 minuets the power "
               + "\ngoes out. Now the fun begins.");
       equationsOne.setEquations("Here will be the equation");
       answersOne.setAnswers("Answers will be displayed here");
       cluesOne.setClues ("Clues will be shown here");
       clueByLocationOne.setClueByLocation ("Location of clue here");
       equationByLocationOne.setClueByLocation ("Location of equation here");
       itemOne.setAmount(1);
       backpack.setInventoryType("satchel");
       dormLayout.setDescription("blueprint");
       gameOne.setTime(0);
       gameOne.setSanityPoints(100);
       roomOne.setColumn(1);
       roomOne.setRow(1);
       roomOne.setVisited(true);
       roomOne.setRoomsRemaining(24);
       regularSceneOne.setDescription("This is a scene for testing purposes. " + 
               "Should you see this scene, that means that the test worked!");
       regularSceneOne.setIsBlocked(false);
  
       
       String playerInfo = playerOne.toString();
       String actorInfo = actorOne.toString();
       String equationsInfo = equationsOne.toString();
       String answersInfo = answersOne.toString();
       String cluesInfo = cluesOne.toString();
       String clueByLocationInfo = clueByLocationOne.toString();
       String resourceInfo = itemOne.toString();
       String inventoryInfo = backpack.toString();
       String mapInfo = dormLayout.toString();
       String gameInfo = gameOne.toString();
       String locationInfo = roomOne.toString();
       String regularSceneTest = regularSceneOne.toString();

       
     

       
       System.out.println(playerInfo);
       System.out.println(actorInfo);
       System.out.println(equationsInfo);
       System.out.println(answersInfo);
       System.out.println(cluesInfo);
       System.out.println(clueByLocationInfo);
       System.out.println(resourceInfo);
       System.out.println(inventoryInfo);
       System.out.println(mapInfo);
       System.out.println(gameInfo);
       System.out.println(locationInfo);
       System.out.println(regularSceneTest);
      
       
    }


}
