/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.AdminManage;
import StudentManagement.Admin;
import StudentManagement.Subject;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AdminManage adm = new AdminManage();
        ArrayList<Admin> admin = new ArrayList<Admin>();
        while(true)
        {
                System.out.println("Add");
                System.out.println("Edit");
                System.out.println("Delete");
                System.out.println("Show");
                System.out.print("Chọn chức năng : ");
            
			int choose = s.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Add");
                                admin.add(adm.add());
				break;

			case 2:
				System.out.println("Edit");
//                                adm.edit();
				break;
			case 3:
				System.out.println("Delete");
//                                adm.delete();
				break;
                        case 4:
				System.out.println("Show");
                                adm.show(admin);
				break;
			default:
				System.out.println("Thang ngu co dau ma chon");
				break;
			}
        }
    }
    
}
