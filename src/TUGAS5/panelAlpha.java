package TUGAS5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class panelAlpha extends JPanel {
    private Color warna;
    
    public panelAlpha(){
           warna = new
           Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),125); 
    }
    public void setBackground(Color bg){
            super.setBackground(bg);
            warna = new
            Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),125); 
            repaint();    
    }
    public void paintComponent(Graphics g){
            super.paintComponent(g);
            
            Graphics2D gd = (Graphics2D)g.create();
                                        gd.setColor(warna);
                                        gd.fillRect(0,0,getWidth(),getHeight());
                                        gd.dispose();
                                        
    }
    
}
