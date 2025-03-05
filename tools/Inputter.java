/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Scanner;

/**
 *
 * @author hanly
 */
public class Inputter {
    private Scanner sc;
    
    public Inputter(){
        this.sc= new Scanner(System.in);
    }
   
    
    public String inputString(String mess){
        System.out.println(mess);
        return this.sc.nextLine();
    }
    
     public int inputInt(String mess){
         while(true){
             try{
                 String dl = inputString(mess);
                return Integer.parseInt(dl);
             }catch(NumberFormatException e){
                 System.out.println("Invalid input");
             }
         }
    }
     
     public float inputFloat(String mess){
         while(true){
         try{
             String dl = inputString(mess);
         return Float.parseFloat(dl);
         }catch (NumberFormatException e){
             System.out.println("Invalid input");
         }
        }    
     }
     
     public double inputDouble(String mess){
         while(true){
             try{
                String dl = inputString(mess);
                 return Double.parseDouble(dl);
             }catch(NumberFormatException e){
                 System.out.println("Invalid input");
             }
         }
     }
     public boolean inputBoolean(String mess){
         while(true){
             String dl = inputString(mess);
             if(dl.toLowerCase().equals("true"))
                 return true;
             else if(dl.toLowerCase().equals("else"))
                 return false;
             else   
                 System.out.println("Không hợp lệ");
         }
     }
}
