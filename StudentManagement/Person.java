/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.util.Date;
import java.util.Scanner;
        
/**
 *
 * @author nguye
 */
public class Person {
   public String Id;
   public String Name;
   public Date dob;
   public String email;
   public int phonenumber;
   public String address;
   // Ham khoi tao co doi so
   /**
    * @param Id
    * @param Name
    * @param dob
    * @param email
    * @param phonenumber
    * @param address
    */
   public Person(String Id, String Name,Date dob, String email,int phonenumber,String address ){
      this.Id = Id;
      this.Name = Name;
      this.dob = dob;
      this.email = email;
      this.phonenumber = phonenumber;
      this.address = address;
   }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
   // Ham hien thi thong tin
   public void display() {
       System.out.println("\tId: " + Id);
       System.out.println("\tHo ten: " + Name);
       System.out.println("\tNgay Sinh: " + dob);
       System.out.println("\tEmail: "+ email);
       System.out.println("\tDien thoai:" + phonenumber);
       System.out.println("\tDia chi: " + address);
   }

   // Ham nhap thong tin
   public void enter(Scanner sc,Date date) {
       System.out.print("\tNhap id: ");
       Id = sc.nextLine();
       System.out.print("\tNhap ho ten: "+Name );
       sc.nextLine();
       Name = sc.nextLine();
       System.out.print("\tNgay Sinh: "+ dob);
//       
//       date.setTime();
//       //Khong biet next line j
//       
       System.out.println("\tEmail: "+ email);
       sc.nextLine();
       email = sc.nextLine();
       System.out.println("\tDien thoai:" + phonenumber);
       sc.nextInt();
       phonenumber = sc.nextInt();
       System.out.print("\tNhap dia chi: ");
       sc.nextLine();
       address = sc.nextLine();
   }
}
