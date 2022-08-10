/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public interface Action {

    public Object add();
    public boolean edit(ArrayList<Object> items);
    public boolean delete(ArrayList<Object> items);
    public void show(ArrayList<Object> items);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
