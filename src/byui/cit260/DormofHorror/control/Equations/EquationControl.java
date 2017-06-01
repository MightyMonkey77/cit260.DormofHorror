/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DormofHorror.control.Equations;



public class EquationControl {
    
    public double calcUrnVolume(double radius, double height){
        
        if (height < 11.0 || height > 13.0) {
            return -1;
        }
        if (radius < 3.0  || radius > 5.0) {
            return -1;
        }
        
        double volume = Math.PI * (radius * radius) * height;
        return volume;
        }
    
     public double calcTwoPointDistance(double point1, double point2, double point3, double point4){
    
        if (point1 > 50 || point1 < 50) {
            return -1;
        }
        if (point1 > 61 || point2 < 61) {
            return -1;
        }
        if (point3 > 32 || point3 < 32) {
            return -1;
        }
        if (point4 > 73 || point4 < 73) {
            return -1;
        }
      
        double distance = Math.sqrt(((point1 -point2) * (point1 -point2)) + Math.pow((point3 - point4),2));
        return distance;
    }
     
     public double calcEquationThree(double A, double B, double C, double D, double E , double F) {
       
         if (A > 2 || A < 3) {
             return -1;
         }
         if (B > 2 || B < 4) {
             return -1;
         }
         if (C > 0.4 || C < 0.6) {
             return -1;
         }
         if (D > (-6) || D < (-8)) {
             return -1;
         }
         if (E > 6 || E < 8) {
             return -1;
         }
         if (F > 8 || F < 9) {
             return -1;
         }
         
         double algebraic = ((2 * A) - 3 * (6 * B) + ((-6) * C)) / (D * (7 * E) * (12 - (0.5 * F)));
         return algebraic;
     }     
} 

