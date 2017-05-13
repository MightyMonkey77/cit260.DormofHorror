/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.dormofhorror.GameClass;

import java.io.Serializable;

/**
 *
 * @author CNTin
 */
public class Game implements Serializable {
    
    // class instance variables
    private int sanityPoints;
    private int time;

    public Game() {
    }
    
    // class functions

    public int getSanityPoints() {
        return sanityPoints;
    }

    public void setSanityPoints(int sanityPoints) {
        this.sanityPoints = sanityPoints;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.sanityPoints;
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
        if (this.sanityPoints != other.sanityPoints) {
            return false;
        }
        if (this.time != other.time) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "sanityPoints=" + sanityPoints + ", time=" + time + '}';
    }
    
    
}