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
import java.util.List;
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
        System.out.println("Enter AdminID:");
        ad.setadminId(s.nextLine());
        System.out.println("Enter Name:");
        ad.setadminName(s.nextLine());
        System.out.println("Enter DoB:");
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ad.setdob(date.parse(s.nextLine()));
        } catch (ParseException ex) {
            Logger.getLogger(AdminManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Enter Email:");
        ad.setadminId(s.nextLine());
        System.out.println("Enter Numberphone:");
        ad.setphonenumber(s.nextInt());        
        System.out.println("Enter Adress:");
        ad.setadminId(s.nextLine());
        return ad;
    }

    @Override
    public boolean edit(ArrayList<Admin> Admin) {
        return true;
    }

    @Override
    public boolean delete(ArrayList<Admin> Admin) {
        return true;
    }

    @Override
    public void show(ArrayList<Admin> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getadminId());
        }
        
    }
}
