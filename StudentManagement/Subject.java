/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author anhva
 */
public class Subject {
     private String subjectID;
     private String subjectName;
     private String mark;
     
     public Subject(String subjectID,String subjectName, String mark)
     {
      this.subjectID=subjectID;
      this.subjectName=subjectName;
      this.mark=mark;
     }
     public static void main(String[] args) {
        List<Subject> subject = new ArrayList<Subject>();
    }
}
