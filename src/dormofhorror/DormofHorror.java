/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dormofhorror;

import cit260.dormofhorror.characters.Player;
import cit260.dormofhorror.actingjob.Actor;

/**
 *
 * @author Office Payne
 */
public class DormofHorror {

     
    public static void main(String[] args) {
       Player playerOne = new Player();
       Actor actorOne = new Actor();
       //Not sure what to do with coordinates at this time.
       
       playerOne.setName("Fred Flinstone");
       actorOne.setName ("George Binazowski");
       actorOne.setDescription("You have been invited to spend an evening at a party"
               + "hosted by your friend Jack Clawsen, at his Dorm room. You eagerly accept"
               + "his invitation. You have not seen him since you were in grade school together."
               + "You make the hour long drive using the sirection provided to arrive at what "
               + "appears to be a rundown set of dorms. You think, 'meh! Stayed in worse' and walk "
               + "into and up to his room. You knock and are greated by Jack with a hearty hello "
               + "and a handshake. He asks how you have been and reminisces about the past. He  "
               + "teases you about how much of a scardy cat you were. After an hour passes he "
               + "excuses himself and says he needs to check on another friend in another room to "
               + "see why they have not come over yet. After he is gone for 10 minuets the power "
               + "goes out. Now the fun begins.");
       
       String playerInfo = playerOne.toString();
       String actorInfo = actorOne.toString();
       
       System.out.println(playerInfo);
       System.out.println(actorInfo);
    }
    
}
