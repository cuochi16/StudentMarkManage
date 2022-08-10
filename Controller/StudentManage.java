/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Interface.Action;
import StudentManagement.Student;
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
public class StudentManage implements Action<Student>{

    @Override
    public Student add() {
        Student ad = new Student();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter AdminID:");
        ad.setstudentId(s.nextLine());
        System.out.println("Enter Name:");
        ad.setstudentName(s.nextLine());
        System.out.println("Enter DoB:");
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ad.setdob(date.parse(s.nextLine()));
        } catch (ParseException ex) {
            Logger.getLogger(AdminManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Enter Email:");
        ad.setemail(s.nextLine());
        System.out.println("Enter Numberphone:");
        ad.setphonenumber(s.nextInt());        
        System.out.println("Enter Adress:");
        ad.setaddress(s.nextLine());
        return new Student();
    }

    @Override
    public boolean edit(ArrayList<Student> items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ArrayList<Student> items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show(ArrayList<Student> items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
