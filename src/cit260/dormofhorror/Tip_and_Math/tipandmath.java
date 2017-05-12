/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.dormofhorror.Tip_and_Math;

import java.util.Objects;

/**
 *
 * @author Office Payne
 */
public class tipandmath {

  
      
        
    private String clueByLocation;
    private String equationBylocation;

    public tipandmath() {
    }

    

    public String getClueByLocation() {
        return clueByLocation;
    }

    public void setClueByLocation(String clueByLocation) {
        this.clueByLocation = clueByLocation;
    }

    public String getEquationBylocation() {
        return equationBylocation;
    }

    public void setEquationBylocation(String equationBylocation) {
        this.equationBylocation = equationBylocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.clueByLocation);
        hash = 97 * hash + Objects.hashCode(this.equationBylocation);
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
        final tipandmath other = (tipandmath) obj;
        if (!Objects.equals(this.clueByLocation, other.clueByLocation)) {
            return false;
        }
        if (!Objects.equals(this.equationBylocation, other.equationBylocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tipandmath{" + "clueByLocation=" + clueByLocation + ", equationBylocation=" + equationBylocation + '}';
    }
    
    
}
