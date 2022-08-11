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
    private String studentId;
    private String studentName;
    private Class classID;
 
//      public Student(String studentId, String studentName, Date dob, String email, int phonenumber, String address)
//      {
//      studentId = Id;
//      studentName = Name;
//      this.dob = dob;
//      this.email= email;
//      this.phonenumber = phonenumber;
//      this.address= address;
//      }

    
      public String getstudentId()
      {
          return studentId;
      }
      public void setstudentId(String a)
      {
          studentId= a;
      }
      public String getstudentName()
      {
          return studentName;
      }
      public void setstudentName(String b)
      {
          studentName=b;
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
}
