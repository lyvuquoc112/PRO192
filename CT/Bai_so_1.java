/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CT;

import Bussiness.Store;
import java.util.Scanner;

/**
 *
 * @author hanly
 */
public class Bai_so_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store ds = new Store();
        int choice = 0;
        do{
            System.out.println("----------------------------------\n"
                    +"1. Add new fashion\n"
                    +"2. Search by name\n"
                    +"3. Print all fashion\n"
                    +"4. Delete a fashion\n"
                    +"5. Exit program\n"
                    +"----------------------------------\n"
                    +"Choose your function");
            choice = sc.nextInt();
            switch(choice){
                    case 1:
                        ds.addNewFashion();
                        break;
                    case 2:
                        System.out.print("Mời nhập tên muốn tìm: ");
                        if(sc.hasNextLine())
                            sc.nextLine();
                        String name = sc.nextLine();
                        ds.searchByName(name);
                        break;
                    case 3:
                        ds.printAllFashion();
                        break;
                    case 4:
                        System.out.print("Mời nhập mã sản phẩm muốn xóa: ");
                        if(sc.hasNextLine())
                            sc.nextLine();
                        String code = sc.nextLine();
                        if(ds.delet(code))
                            System.out.println("Đã xóa thành công");
                        else
                            System.out.println("Lỗi");
                        break;
                    case 5:
                        System.out.println("Bye bye");
                        break;
                    default:
                        System.out.println("Không hợp lệ");
                        break;
            }
        }while(choice!=5);
    }
}
