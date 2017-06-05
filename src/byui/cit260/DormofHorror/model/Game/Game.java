/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DormofHorror.model.Game;

import java.io.Serializable;

/**
 *
 * @author CNTin
 */
public class Game implements Serializable {
    
    // class instance variables
    
    private int time;

    public Game() {
    }
    
    // class functions

    
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.time;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        
        return this.time == other.time;
    }

    public void setStart(String new_Game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}