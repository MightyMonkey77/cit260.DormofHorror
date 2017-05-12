/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathematics;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Office Payne
 */
public class Math implements Serializable {

    public Math() {
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
        final Math other = (Math) obj;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setEquation(String future_Equation_insert_here) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}