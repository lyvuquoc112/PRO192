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
public class Fashion_ver1 extends Product_ver1 {
    private int model;
    private String collection;

    public Fashion_ver1() {
        super();
    }

    public Fashion_ver1(int model, String collection, String code, String name, float price, float quantity) {
        super(code, name, price, quantity);
        this.model = model;
        this.collection = collection;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }
    
    public  String toString(){
        return super.toString()+String.format("%5d|%20s",this.model, this.collection);
    }
    
}
