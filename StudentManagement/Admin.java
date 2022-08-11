 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.util.Date;

/**
 *
 * @author nguye
 */
public class Admin extends Person {

    private String adminId;
    private String adminName;
//    public Admin(String adminId, String adminName, Date dob, String email, int phonenumber, String address)
//      {
//        adminId = Id;
//        adminName = Name;
//        this.dob = dob;
//        this.email= email;
//        this.phonenumber = phonenumber;
//        this.address= address;
//      }

      public String getadminId()
      {
          return adminId;
      }
      public void setadminId(String a)
      {
          adminId= a;
      }
      public String getadminName()
      {
          return adminName;
      }
      public void setadminName(String b)
      {
          adminName=b;
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
