/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhva
 */
public class Marks
        {
          private String markId;
          private Student student;
          private Subject subject;
          private String mark;
          
          public Marks(String markId, Student student, Subject subject, String mark)
          {
            this.markId = markId;
            this.student = student;
            this.subject = subject;
            this.mark = mark;
          }
}

