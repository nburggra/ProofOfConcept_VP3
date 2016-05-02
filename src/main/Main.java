/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.*;

/**
 *
 * @author NickB
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
       frame.setSize(300, 300);
       frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE);    
       frame.setTitle("Hartige Hap");
       frame.setContentPane(new Mainmenu());
       frame.setVisible(true); 
       
    }
    
}
