/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interface.Action;
import StudentManagement.Admin;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye
 */
public class AdminManage implements Action<Admin> {

    @Override
    public Admin add() {
        Admin ad = new Admin();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter AdminID:");
        ad.setadminId(s.nextLine());
        System.out.print("Enter Name:");
        ad.setadminName(s.nextLine());
        System.out.print("Enter DoB:");
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ad.setdob(date.parse(s.nextLine()));
        } catch (ParseException ex) {
            Logger.getLogger(AdminManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("Enter Email:");
        ad.setemail(s.nextLine());
        System.out.print("Enter Numberphone:");
        ad.setphonenumber(s.nextInt());        
        System.out.print("Enter Adress:");
        s = new Scanner(System.in);
        ad.setaddress(s.nextLine());
        return ad;
    }

    @Override
    public boolean edit(ArrayList<Admin> listad) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can sua: ");
        String tempID = s.nextLine();
        for (int i = 0; i < listad.size(); i++) {
            Admin admin = listad.get(i);
            if(admin.getadminId().equals(tempID)){
                boolean a = true;
                while(a)
                {
                    System.out.println("****************************");
                    System.out.println("1.Edit name");
                    System.out.println("2.Edit DoB");
                    System.out.println("3.Edit email");
                    System.out.println("4.Edit phonenumber");
                    System.out.println("5.Edit address");
                    System.out.println("6.Exit");
                    System.out.print("Chon chuc nang : ");
                            int choose1 = s.nextInt();
                            switch (choose1) {
                            case 1:
                                    System.out.print("Edit name: ");
                                    s = new Scanner(System.in);
                                    String temp = s.nextLine();
                                    admin.setadminName(temp);
                                    break;

                            case 2:
                                    System.out.print("Edit DoB");
                                    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
                                    try {
                                        admin.setdob(date.parse(s.nextLine()));
                                    } catch (ParseException ex) {
                                        Logger.getLogger(AdminManage.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    break;
                            case 3:
                                    System.out.print("Edit email");
                                    s = new Scanner(System.in);
                                    admin.setemail(s.nextLine());
                                    break;
                            case 4:
                                    System.out.print("Edit phonenumber");
                                    s = new Scanner(System.in);
                                    admin.setphonenumber(s.nextInt());
                                    break;
                            case 5:
                                    System.out.print("Edit address");
                                    s = new Scanner(System.in);
                                    admin.setaddress(s.nextLine());
                                    break;
                            case 6:
                                    System.out.println("Exit");
                                    a = false;
                                    break;
                            default:
                                    System.out.println("Thang ngu co dau ma chon");
                                    break;
                            }
                }
            }
            else{
                System.out.println("Khong tim thay ID nay");
            }
        }
        return true;
    }

    @Override
    public boolean delete(ArrayList<Admin> listad) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can xoa: ");
        String tempID = s.nextLine();
        for (int i = 0; i < listad.size(); i++) {
            if(listad.get(i).getadminId().equals(tempID)){
                listad.remove(i);
                System.out.println("Xoa thanh cong 1 thang ngu");
            }
            else{
                System.out.println("Co thang nay dau ma xoa thang dan don!!!");
            }
        }
        return true;
    }

    @Override
    public void show(ArrayList<Admin> listad) {
        for (int i = 0; i < listad.size(); i++) {
            System.out.printf("|%-10s |%-15s | %-30s | %-15s| %-15s|%-10s |%n", listad.get(i).getadminId(),listad.get(i).getadminName(),listad.get(i).getdob(),listad.get(i).getemail(),listad.get(i).getphonenumber(),listad.get(i).getaddress());
        }
        
    }
}
