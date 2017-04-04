package TUGAS5;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
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
public class panelGambar extends JPanel {
 private Image image;  
 public panelGambar(){
     image = new
     ImageIcon(getClass().getResource("/Gambar/bintang_laut.jpg")).getImage();
 }
 protected void paintComponent(Graphics g){
 super.paintComponent(g);
 
 Graphics gd =(Graphics2D)    
 g.create();
 
 gd.drawImage(image,0,0,getWidth(),getHeight(),this);
 gd.dispose();
 
 }    
}
