/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlloer;

import dto.Accountant;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import tools.Inputter;
import tools.Store;

/**
 *
 * @author hanly
 */
public class Test {
    public static void main(String[] args) {
         Store ds = new Store();
         Inputter sc = new Inputter();
         SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy");
         int choice = 0;
         do{
             System.out.println("1. Add accountant information\n"
                     + "2. Show all accountants\n"+
                     "3. Delete an accountant\n"+
                     "4. Filter accountants by high salary\n"+
                     "5. Exit program\n"+
                     "Enter number to choose your function\n");
             choice = sc.inputInt("");
             switch(choice){
                 case 1:
                     ds.addAccountant();
                     break;
                 case 2:
                     ds.showAllAccountant();
                     break;
                 case 3:
                     System.out.println("Nhập id muốn xóa");
                     String id = sc.inputString("ID: ");
                     if(ds.deleteAccountant(id))
                         System.out.println("Delete success");
                     else
                         System.out.println("Fail");
                     break;
                 case 4:
                     ds.filterByHighSalary();
                     break;
                 case 5:
                     System.out.println("Bye bye");
                     break;
                 default:
                     System.out.println("Invalid function");
             }
         }while(choice!=5);
    }
   
}
