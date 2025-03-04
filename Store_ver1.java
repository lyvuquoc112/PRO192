/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Model.Fashion;
import Model.Fashion_ver1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hanly
 */
public class Store_ver1 {
     ArrayList<Fashion_ver1>ds;
     
     public Store_ver1(){
         ds=new ArrayList<>();
     }
     
     public void addNewFashion(){
         Fashion_ver1 x = input();
         ds.add(x);
     }
     
     public void search(String name){
         //
          for(Fashion_ver1 i : ds){
              if(i.getName().toLowerCase().equalsIgnoreCase(name)){
                  System.out.println(i);
              }
          }
     }
     
     public void print(){
         //
         for(Fashion_ver1 i:ds){
             System.out.println(i);
         }
     }
     
     public boolean delet(String code){
         boolean removed = false;

         Fashion_ver1 x =searchByCode(code);
         if(x!=null){
             ds.remove(x);
             removed = true;
         }
        return removed;
     }
     
     private Fashion_ver1 searchByCode(String code){
         Fashion_ver1 removed = null;
         for(Fashion_ver1 i :ds){
             if(i.getCode().toLowerCase().equalsIgnoreCase(code)){
                 removed = i;
             }
         }
         return removed;
     }
     
     private Fashion_ver1 input(){
        Fashion_ver1 x = new Fashion_ver1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code: ");
        x.setCode(sc.nextLine());
        System.out.print("Enter name: ");
        x.setName(sc.nextLine());
        System.out.print("Price: ");
        x.setPrice(sc.nextFloat());
        System.out.print("Quantity: ");
        x.setQuantity(sc.nextFloat());
        System.out.print("Model year : ");
        x.setModel(sc.nextInt());
        if(sc.hasNextLine())
            sc.nextLine();
        System.out.print("Collection: ");
        x.setCollection(sc.nextLine());
        return x;
    }
}
