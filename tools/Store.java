/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import dto.Accountant;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hanly
 */
public class Store {
    List<Accountant> ds;
    Inputter inputter;
    SimpleDateFormat dateFormat;
    public Store(){
        ds = new ArrayList<>();
        this.inputter = new Inputter();
        this.dateFormat = new SimpleDateFormat("dd/mm/yyyy");
    }
    public void addAccountant(){
       Accountant x = input();
           ds.add(x);
    }
    public void showAllAccountant(){
        if(ds.isEmpty()){
            System.out.println("Không có gì cả");
        }else{
            for(Accountant i: ds){
                System.out.println(i);
            }
        }
    }
    
    public boolean deleteAccountant(String code){
        boolean removed = false;
        Accountant x = findByCode(code);
        if(x!=null){
            ds.remove(x);
            removed = true;
        }
        //
        return removed;
    }
    public void filterByHighSalary(){
        if(ds.isEmpty())
            System.out.println("Không có gì cả");
        else{
            for(Accountant i : ds){
                if(i.earnMoney()>3000){
                    System.out.println(i);
                }
            }
        }
    }
    
    private Accountant findByCode(String code){
        Accountant keep = null;
        if(ds.isEmpty())
            System.out.println("Không có gì cả");
        else{
            for(Accountant i : ds){
                if(i.getId().toLowerCase().equalsIgnoreCase(code)){
                    System.out.println(i);
                    keep = i;
                }
            }
        }
        return keep;
    }
    
    private boolean isIDExist(String id){
        for (Accountant i : ds){
            if (i.getId().toLowerCase().equalsIgnoreCase(id)){
                return true;
            }
        }
        return false;
    }
    
    private Accountant input(){
        String id;
        do{
            id = inputter.inputString("ID: ");
            if(isIDExist(id)){
                System.out.println("ID đã tồn tại, vui lòng nhập id khác");
            }
        }while(isIDExist(id));
        
        Accountant x = new Accountant();
        x.setId(id);
        x.setFirstName(inputter.inputString("First name: "));
        x.setSureName(inputter.inputString("Sure name: "));
        try{
            Date birthday = dateFormat.parse(inputter.inputString("Ngày sinh (dd/mm/yyyy)"));
            x.setBirthday(birthday);
        }catch(ParseException e){
            System.out.println("Định dạng ngày tháng không hợp lệ");
            return null;
        }
        x.setGender(inputter.inputBoolean("Gender (true:Male false:Female)"));
        x.setPhone(inputter.inputString("Phone: "));
        x.setBasicSalary(inputter.inputFloat("Basic salary: "));
        x.setReward(inputter.inputInt("Reward: "));
        return x;
    }
}
