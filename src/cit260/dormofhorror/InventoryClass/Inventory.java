/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.dormofhorror.InventoryClass;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author RJrHerrera
 */
public class Inventory implements Serializable{
    private String inventoryType;
    private double quantityInStock;
    private double maxAmount;

    public Inventory() {
    }
    
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.inventoryType);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.maxAmount) ^ (Double.doubleToLongBits(this.maxAmount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", maxAmount=" + maxAmount + '}';
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
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.quantityInStock) != Double.doubleToLongBits(other.quantityInStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxAmount) != Double.doubleToLongBits(other.maxAmount)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }
    
    
}
