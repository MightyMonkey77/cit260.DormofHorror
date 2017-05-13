/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DormofHorror.model.LocationClass;

/**
 *
 * @author Office Payne
 */
import java.io.Serializable;

/**
 *
 * @author CNTin
 */
public class Location implements Serializable {
    
    // class instance variables
    private int row;
    private int column;
    private boolean visited;
    private int roomsRemaining;

    public Location() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getRoomsRemaining() {
        return roomsRemaining;
    }

    public void setRoomsRemaining(int roomsRemaining) {
        this.roomsRemaining = roomsRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.row;
        hash = 17 * hash + this.column;
        hash = 17 * hash + (this.visited ? 1 : 0);
        hash = 17 * hash + this.roomsRemaining;
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.roomsRemaining != other.roomsRemaining) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", roomsRemaining=" + roomsRemaining + '}';
    }
    
    
    
}