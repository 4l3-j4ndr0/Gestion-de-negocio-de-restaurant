/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author 4L3
 */
public class Escritorio extends JDesktopPane{

       Image IMG=new ImageIcon(getClass().getResource("/imagenes/principal/fondoP2.jpg")).getImage();

       @Override
        public void paintChildren(Graphics g){
            g.drawImage(IMG, 0, 0, getWidth(), getHeight(), this);
            super.paintChildren(g);
        }
    } 
