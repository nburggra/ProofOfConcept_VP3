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
    private JButton VG,HG,DR;
    public Frame(){
        VG = new JButton ("Voorgerecht");
        VG.addActionListener(new VGHandler());
        
        HG = new JButton ("Hoofdgerecht");
        HG.addActionListener(new VGHandler());
        
        DR = new JButton ("Drankjes");
        DR.addActionListener(new VGHandler());
        
        add(VG);
        add(HG);
        add(DR);
    }
       class VGHandler implements ActionListener{
                public void actionPerformed(ActionEvent e){
                    NewFrameSetup VGFrame = new NewFrameSetup();
                    
                }
       }
                       class HGHandler implements ActionListener{
                public void actionPerformed(ActionEvent e){
                    NewFrameSetup HGFrame = new NewFrameSetup();
                    
                }
                       }
                       class DRHandler implements ActionListener{
                public void actionPerformed(ActionEvent e){
                    NewFrameSetup DRFrame = new NewFrameSetup();
                    
                }
                       }

}
