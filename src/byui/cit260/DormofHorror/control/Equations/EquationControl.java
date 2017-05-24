/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DormofHorror.control.Equations;

/**
 *
 * @author Office Payne
 */
public class EquationControl {
    
    public double calcUrnVolume(double radius, double height){
        
        if (height > 12.5 || height < 12.5) {
            return -1;
        }
        if (radius > 3.7 || radius < 3.7) {
            return -1;
        }    
        double volume = Math.PI * Math.pow(radius,2) * height;
        return volume;
        }
         
    

    public int calcTwoPointDistance(int point1, int point2, int point3, int point4){
    
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
        double distance = Math.sqrt (Math.pow((point1 -point2), 2)) + Math.sqrt((Math.pow(point3 - point4), 2);
        Return distance;
    
