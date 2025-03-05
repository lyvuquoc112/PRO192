/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;

/**
 *
 * @author hanly
 */
public class Accountant extends Person implements Working{
    
    private double basicSalary;
    private int reward;

    public Accountant() {
        super();
    }

    public Accountant(double basicSalary, int reward, String id, String firstName, String sureName, Date birthday, boolean gender, String phone) {
        super(id, firstName, sureName, birthday, gender, phone);
        this.basicSalary = basicSalary;
        this.reward = reward;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if(basicSalary>0)
            this.basicSalary = basicSalary;
        else
            System.out.println("Invalid basic salary");
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        if(basicSalary>=0)
            this.reward = reward;
        else
            System.out.println("Invalid reward");
    }
    
    

    @Override
    public double earnMoney() {
        return basicSalary+reward;
    }

    @Override
    public double tax() {
        return earnMoney()<1000?0:
                earnMoney()<3000?((earnMoney()-1000)*0.1):
                ((earnMoney()-3000)*0.25);
    }
    
    public String toString(){
        return super.toString()+String.format("%10f|%10d|10%f|10%f",this.basicSalary,this.reward,this.earnMoney(),this.tax());
    }
}
