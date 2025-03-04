/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CT;

import Bussiness.Store_ver1;
import Model.Fashion_ver1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hanly
 */
public class Bai_so_1_ver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store_ver1 ds = new Store_ver1();
        int choice = 0;
        do{
            System.out.println("---------------------------------------------");
            System.out.println("1. Add new Fashion");
            System.out.println("2. Serach by name");
            System.out.println("3. Print all fashion");
            System.out.println("4. Delete a fashion");
            System.out.println("5. Exit the program");
            System.out.println("---------------------------------------------");
            System.out.println("Enter a function you want:");
            choice= sc.nextInt();
            switch(choice){
                case 1:
                    ds.addNewFashion();
                    break;
                case 2:
                    System.out.println("Enter a name wanted to found");
                    if(sc.hasNextLine())
                        sc.nextLine();
                    String name = sc.nextLine();
                    ds.search(name);
                    break;
                case 3:
                    ds.print();
                    break;
                case 4:
                    System.out.println("Enter a code wanted to deleted");
                    if(sc.hasNextLine())
                        sc.nextLine();
                    String code = sc.nextLine();
                    if(ds.delet(code))
                        System.out.println("Delete success");
                    else
                        System.out.println("Delete fail");
                    break;
                case 5:
                    System.out.println("Thank you for using this program, bye bye");
                    break;
                default:
                    System.out.println("Invlaid function");
                    break;
            }
        }while(choice!=5);
    }  
}
