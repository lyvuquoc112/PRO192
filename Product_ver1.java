/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hanly
 */
public class Product_ver1 {
    private String code;
    private String name;
    private float price;
    private float quantity;

    public Product_ver1() {
    }

    public Product_ver1(String code, String name, float price, float quantity) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
    
    public String toString(){
        return String.format("%6s|%20s|%5.2f|%5.0f",this.code,this.name,this.price,this.quantity);
    }
    
}
