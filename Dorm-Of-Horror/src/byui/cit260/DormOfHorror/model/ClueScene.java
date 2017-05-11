/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.dormofhorror.tip;

import java.util.Objects;

/**
 *
 * @author Office Payne
 */
public class ClueScene {

    public ClueScene() {
    }
            
    private String clues;
    private String answers;

    public String getClues() {
        return clues;
    }

    public void setClues(String clues) {
        this.clues = clues;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.clues);
        hash = 47 * hash + Objects.hashCode(this.answers);
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
        final ClueScene other = (ClueScene) obj;
        if (!Objects.equals(this.clues, other.clues)) {
            return false;
        }
        if (!Objects.equals(this.answers, other.answers)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClueScene{" + "clues=" + clues + ", answers=" + answers + '}';
    }
    
    
    
}
