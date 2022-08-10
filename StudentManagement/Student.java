/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.util.Date;

/**
 *
 * @author anhva
 */
public class Student extends Person {
 
      public Student(String studentId, String studentName, Date dob, String email, int phonenumber, String address)
      {
      studentId = Id;
      studentName = Name;
      this.dob = dob;
      this.email= email;
      this.phonenumber = phonenumber;
      this.address= address;
      }

    public Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public String getstudentId()
      {
          return Id;
      }
      public void setstudentId(String studentId)
      {
          studentId= Id;
      }
      public String getstudentName()
      {
          return Name;
      }
      public void setstudentName(String studentName)
      {
          studentName=Name;
      }
      public Date getdob()
      {
          return dob;
      }
      public void setdob(Date dob)
      {
          this.dob=dob;
      }
      public String getemail()
      {
          return email;
      }
      public void setemail(String email)
      {
          this.email=email;
      }
      public int getphonenumber()
      {
          return phonenumber;
      }
      public void setphonenumber(int phonenumber)
      {
          this.phonenumber=phonenumber;
      }
      public String getaddress()
      {
          return address;
      }
      public void setaddress(String address)
      {
          this.address=address;
      }
      
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
