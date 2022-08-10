/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;



/**
 *
 * @author anhva
 */
public class Class {
    private String classID;
    private String className;
    private Student student;
    private Subject subject;
    
    public Class(String classID, String className, Student student, Subject subject)
    {
        this.classID=classID;
        this.className=className;
        this.student=student;
        this.subject=subject;
    }
}
