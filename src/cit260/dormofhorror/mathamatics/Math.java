/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.dormofhorror.mathamatics;

import java.util.Objects;

/**
 *
 * @author Office Payne
 */
public class Math {
    private String equations;
    private String answsers;

    public Math() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEquations() {
        return equations;
    }

    public void setEquations(String equations) {
        this.equations = equations;
    }

    public String getAnswsers() {
        return answsers;
    }

    public void setAnswsers(String answsers) {
        this.answsers = answsers;
    }

    public Math(String equations, String answsers) {
        this.equations = equations;
        this.answsers = answsers;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.equations);
        hash = 13 * hash + Objects.hashCode(this.answsers);
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
        final Math other = (Math) obj;
        if (!Objects.equals(this.equations, other.equations)) {
            return false;
        }
        return Objects.equals(this.answsers, other.answsers);
    }

    @Override
    public String toString() {
        return "Math{" + "equations=" + equations + ", answsers=" + answsers + '}';
    }
    
    
   
   
}
