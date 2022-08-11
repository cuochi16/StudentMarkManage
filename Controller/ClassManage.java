/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interface.Action;
import java.util.ArrayList;
import StudentManagement.Class;
import java.util.Scanner;

/**
 *
 * @author H
 */
public class ClassManage implements Action<Class>{

    @Override
    public Class add() {
        Class cl = new Class();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ClassID:");
        cl.setclassID(s.nextLine());
        System.out.print("Enter ClassName:");
        cl.setclassName(s.nextLine());
        return cl;
    }

    @Override
    public boolean edit(ArrayList<Class> listcl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ArrayList<Class> listcl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show(ArrayList<Class> listcl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
