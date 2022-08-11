/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.AdminManage;
import Controller.ClassManage;
import Controller.StudentManage;
import StudentManagement.Admin;
import StudentManagement.Student;
import StudentManagement.Class;
import java.util.ArrayList;
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
        StudentManage stm = new StudentManage();
        ArrayList<Student> student = new ArrayList<Student>();
        while(true)
        {
            System.out.println("****************************");
            System.out.println("||    1.Admin Manage       ||");
            System.out.println("||    2.Student Manage     ||");
            System.out.println("||    3.Subject Manage     ||");
            System.out.println("||    4.Class Manage       ||");
            System.out.println("||    5.Mark Manage        ||");
            System.out.println("||    6.Exit               ||");
            System.out.println("****************************");
            System.out.print("Chon chuc nang : ");
            int choose = s.nextInt();
            switch (choose) {
            case 1:
                    MenuAdmin(adm, admin);
                    break;
            case 2:
                    MenuStudent(stm, student);
                    break;
            case 3:
                    System.out.println("Subject Manage");
                    MenuAdmin(adm, admin);
                    break;
                        case 4:
                    System.out.println("Class Manage");
                    MenuAdmin(adm, admin);
                    break;
                        case 5:
                    System.out.println("Mark Manage");
                    MenuAdmin(adm, admin);
                    break;
            default:
                    System.out.println("Thang ngu co dau ma chon");
                    break;
            }
        }
        
    }

    private static void MenuAdmin(AdminManage adm, ArrayList<Admin> admin){
        Scanner s = new Scanner(System.in);
        boolean menuad = true;
        while(menuad)
        {
            System.out.println("*******Admin Manage******");
            System.out.println("||       1.Add         ||");
            System.out.println("||       2.Edit        ||");
            System.out.println("||       3.Delete      ||");
            System.out.println("||       4.Show        ||");
            System.out.println("||       5.Exit        ||");
            System.out.println("*************************");
                System.out.print("Chon chuc nang : ");
			int choosead = s.nextInt();
			switch (choosead) {
			case 1:
				System.out.println("Add");
                                admin.add(adm.add());
				break;
			case 2:
				System.out.println("Edit");
                                adm.edit(admin);
				break;
			case 3:
				System.out.println("Delete");
                                adm.delete(admin);
				break;
                        case 4:
				System.out.println("Show");
                                System.out.printf("|%-10s |%-15s | %-30s | %-15s| %-15s|%-10s |%n","ID","Name","DoB","Email","PhoneNumber","Address");
                                adm.show(admin);
				break;
			case 5:
                                menuad = false;
				break;
			default:
				System.out.println("Thang ngu co dau ma chon");
				break;
			}
        }
    }
    private static void MenuStudent(StudentManage stm, ArrayList<Student> student){
        Scanner s = new Scanner(System.in);
        boolean menuad = true;
        while(menuad)
        {
            System.out.println("*****Student Manage******");
            System.out.println("||       1.Add         ||");
            System.out.println("||       2.Edit        ||");
            System.out.println("||       3.Delete      ||");
            System.out.println("||       4.Show        ||");
            System.out.println("||       5.Exit        ||");
            System.out.println("*************************");
            System.out.print("Chon chuc nang : ");
            int choosead = s.nextInt();
            switch (choosead) {
            case 1:
                    System.out.println("Add");
                    student.add(stm.add());
                    break;   
            case 2:
                    System.out.println("Edit");
                    stm.edit(student);
                    break;
            case 3:
                    System.out.println("Delete");
                    stm.delete(student);
                    break;
            case 4:
                    System.out.println("Show");
                    System.out.printf("|%-10s |%-15s | %-30s | %-15s| %-15s|%-10s |%n","ID","Name","DoB","Email","PhoneNumber","Address");
                    stm.show(student);
                    break;
            case 5:
                                menuad = false;
                    break;
            default:
                    System.out.println("Thang ngu co dau ma chon");
                    break;
            }
        }
    }
    private static void MenuClass(ClassManage clm, ArrayList<Class> classs){
        Scanner s = new Scanner(System.in);
        boolean menucl = true;
        while(menucl)
        {
            System.out.println("******Class Manage******");
            System.out.println("||       1.Add         ||");
            System.out.println("||       2.Edit        ||");
            System.out.println("||       3.Delete      ||");
            System.out.println("||       4.Show        ||");
            System.out.println("||       5.Exit        ||");
            System.out.println("*************************");
            System.out.print("Chon chuc nang : ");
            int choosecl = s.nextInt();
            switch (choosecl) {
            case 1:
                    System.out.println("Add");
                    classs.add(clm.add());
                    break;   
            case 2:
                    System.out.println("Edit");
                    clm.edit(classs);
                    break;
            case 3:
                    System.out.println("Delete");
                    clm.delete(classs);
                    break;
            case 4:
                    System.out.println("Show");
                    System.out.printf("|%-10s |%-15s | %-30s | %-15s| %-15s|%-10s |%n","ID","Name","DoB","Email","PhoneNumber","Address");
                    clm.show(classs);
                    break;
            case 5:
                    menucl = false;
                    break;
            default:
                    System.out.println("Thang ngu co dau ma chon");
                    break;
            }
        }
    }
    
}
