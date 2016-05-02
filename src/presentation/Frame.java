/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author NickB
 */
public class Frame extends JPanel {
    private JTabbedPane tab;
    private JPanel p1,p2,p3;

    public Frame(){
        tab = new JTabbedPane();
        
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        
        tab.addTab("Tab 1", p1);
        tab.addTab("Tab 2", p2);
        tab.addTab("Tab 3", p3);
        
        setLayout(new BorderLayout());
        add(tab,BorderLayout.CENTER);
       
    }
}
