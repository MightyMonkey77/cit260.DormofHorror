/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DormofHorror.model.Equations;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Office Payne
 */
public class Equations implements Serializable {

    public Equations() {
    }
 

    private String equations;
    private String answers;

    public String getEquations() {
        return equations;
    }

    public void setEquations(String equations) {
        this.equations = equations;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.equations);
        hash = 53 * hash + Objects.hashCode(this.answers);
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
        final Equations other = (Equations) obj;
        if (!Objects.equals(this.equations, other.equations)) {
            return false;
        }
        return Objects.equals(this.answers, other.answers);
    }

    @Override
    public String toString() {
        return "Math{" + "equations=" + equations + ", answers=" + answers + '}';
    }

    public void setEquation() {
        System.out.println("Future Home of Setting the equation");
    }
    
}