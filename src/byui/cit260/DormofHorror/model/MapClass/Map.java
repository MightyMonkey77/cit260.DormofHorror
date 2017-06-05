/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DormofHorror.model.MapClass;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DPayne
 */
public class Map implements Serializable{
    private String description;
    private int x;
    private int y;
    private int currentX;
    private int currentY;

    public Map() {
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCurrentX() {
        return currentX;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + this.x;
        hash = 53 * hash + this.y;
        hash = 53 * hash + this.currentX;
        hash = 53 * hash + this.currentY;
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
        final Map other = (Map) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (this.currentX != other.currentX) {
            return false;
        }
        if (this.currentY != other.currentY) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }
    
    }
    
    
