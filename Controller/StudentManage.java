/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Interface.ActionStudent;
import StudentManagement.Student;
import StudentManagement.Class;
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
public class StudentManage implements ActionStudent<Student,Class>{

    @Override
    public Student add(ArrayList<Student> listst ,ArrayList<Class> listcl) {
        Student st = new Student();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter StudentID:");
        String id = s.nextLine();
        while(findID(listst,id)){
            id = s.nextLine();
            System.out.println("Da co ID nay");
            System.out.print("Xin moi nhap lai ID:");
        }
        st.setID(id);
        System.out.print("Enter Name:");
        st.setName(s.nextLine());
        System.out.print("Enter DoB (dd/MM/yyyy):");
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {
            st.setDob(date.parse(s.nextLine()));
        } catch (ParseException ex) {
            Logger.getLogger(AdminManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("Enter Email:");
        st.setEmail(s.nextLine());
        System.out.print("Enter Numberphone:");
        st.setPhonenumber(s.nextInt());        
        System.out.print("Enter Adress:");
        s = new Scanner(System.in);
        st.setAddress(s.nextLine());
        boolean checkst = true;
        while(checkst){
            System.out.print("Enter ClassID:");
            String classs =  s.nextLine();
            for (int i = 0; i < listcl.size(); i++) {
                if(classs.equals(listcl.get(i).getclassID())){
                    st.setClasss(listcl.get(i));
                    checkst=false;
                    break;
                }
            }
            if(checkst){
                System.out.println("Khong co lop nay xin moi nhap lai");
            }
        }
        return st;
    }

    @Override
    public boolean edit(ArrayList<Student> listst) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ArrayList<Student> listst) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can xoa: ");
        String tempID = s.nextLine();
        for (int i = 0; i < listst.size(); i++) {
            if(listst.get(i).getID().equals(tempID)){
                System.out.println("Xoa thanh cong sinh vien "+listst.get(i).getName());
                listst.remove(i);
                return true;
            }
        }
        System.out.println("Co thang nay dau ma xoa!!!");
        return false;
    }

    @Override
    public void show(ArrayList<Student> listst) {
        for (int i = 0; i < listst.size(); i++) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String strDate = formatter.format(listst.get(i).getDob());
            System.out.printf("| %-3s | %-10s |%-15s | %-30s | %-15s | %-15s | %-10s | %-10s |%n",i+1, listst.get(i).getID(),listst.get(i).getName(),strDate,listst.get(i).getEmail(),listst.get(i).getPhonenumber(),listst.get(i).getAddress(),listst.get(i).getClasss().getclassName());
        }
        
    }

    @Override
    public boolean findID(ArrayList<Student> items, String id) {
        for (int i = 0; i < items.size(); i++) {
            if(id.equals(items.get(i).getID())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Object add(ArrayList<Student> items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(ArrayList<Student> listst, ArrayList<Class> listcl) {        
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ID can sua: ");
        String tempID = s.nextLine();
        for (int i = 0; i < listst.size(); i++) {
            Student student = listst.get(i);
            if(student.getID().equals(tempID)){
                boolean a = true;
                while(a)
                {
                    System.out.println("****************************");
                    System.out.println("1.Edit name");
                    System.out.println("2.Edit DoB");
                    System.out.println("3.Edit email");
                    System.out.println("4.Edit phonenumber");
                    System.out.println("5.Edit address");
                    System.out.println("6.Edit class");
                    System.out.println("7.Exit");
                    System.out.print("Chon chuc nang : ");
                            int choose1 = s.nextInt();
                            switch (choose1) {
                            case 1:
                                    System.out.print("Edit name: ");
                                    s = new Scanner(System.in);
                                    String temp = s.nextLine();
                                    student.setName(temp);
                                    System.out.println("Sua thanh cong");
                                    break;

                            case 2:
                                    System.out.print("Edit DoB (dd/MM/yyyy):");
                                    s = new Scanner(System.in);
                                    SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
                                    try {
                                        student.setDob(date1.parse(s.nextLine()));
                                    } catch (ParseException ex) {
                                        Logger.getLogger(AdminManage.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.println("Sua thanh cong");
                                    break;
                            case 3:
                                    System.out.print("Edit email: ");
                                    s = new Scanner(System.in);
                                    student.setEmail(s.nextLine());
                                    System.out.println("Sua thanh cong");
                                    break;
                            case 4:
                                    System.out.print("Edit phonenumber:");
                                    s = new Scanner(System.in);
                                    student.setPhonenumber(s.nextInt());
                                    System.out.println("Sua thanh cong");
                                    break;
                            case 5:
                                    System.out.print("Edit address:"); 
                                    s = new Scanner(System.in);
                                    student.setAddress(s.nextLine());
                                    System.out.println("Sua thanh cong");
                                    break;
                            case 6:
                                    System.out.println("Edit class");
                                    boolean checkst = true;
                                    while(checkst){
                                        System.out.print("Enter ClassID:");
                                        s = new Scanner(System.in);
                                        String classs =  s.nextLine();
                                        for (int j = 0; j < listcl.size(); j++) {
                                            if(classs.equals(listcl.get(j).getclassID())){
                                                student.setClasss(listcl.get(j));
                                                checkst=false;
                                                break;
                                            }
                                        }
                                        if(checkst){
                                            System.out.println("Khong co lop nay xin moi nhap lai");
                                        }
                                    }
                                    System.out.println("Sua thanh cong");
                                    break;
                                    
                            case 7:
                                    System.out.println("Exit");
                                    a = false;
                                    break;
                            default:
                                    System.out.println("Thang ngu co dau ma chon");
                                    break;
                            }
                }
                return true;
            }
        }
        System.out.println("Khong co sinh vien nay");
        return false;
    }

    @Override
    public boolean search(ArrayList<Student> items, ArrayList<Class> items1) {
        
        return false;
    }

    
}
