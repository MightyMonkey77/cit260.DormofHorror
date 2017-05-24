/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DormofHorror.control.Equations;



public class EquationControl {
    
    public double calcUrnVolume(double radius, double height){
        
        if (height != 12.5) {
            return -1;
        }
        if (radius != 3.7) {
            return -1;
        }
        
        double volume = Math.PI * (radius * radius) * height;
        return volume;
        }
         
} 

