package Gui_07342;

import javax.imageio.ImageIO;
import java.awt.image.ColorModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuPembeli_07342 extends ComponentGui_07342 {
    String pathicon;
    
    public MenuPembeli_07342(){
        initComponent();
    }
    
    void initComponent(){
        setTitle("MENU PEMBELI");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,350);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.gray.brighter());
        setLayout(null);
        setVisible(true);
        
        btnback.setBounds(10, 20, 80, 25);
        btnback.setBackground(Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
        
        btnback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnback.setForeground(Color.yellow);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnback.setForeground(Color.black);
            }
        });
        
        btnback.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Menu_07342 menu = new Menu_07342();
                menu.setVisible(true);
                dispose();
            }
        });
        
        btnLDP.setBounds(90, 150, 200, 25);
        btnLDP.setBackground(Color.blue.brighter());
        btnLDP.setForeground(Color.WHITE);
        btnLDP.setBorder(null);
        add(btnLDP);
        
        btnnotregP.setBounds(90, 100, 200, 25);
        btnnotregP.setBackground(Color.blue.brighter());
        btnnotregP.setForeground(Color.WHITE);
        btnnotregP.setBorder(null);
        add(btnnotregP);
        
        bingkaigambar.setBounds(0, 0, 400, 350);
        add(bingkaigambar);
        
        pathicon = "./src/Images/g1.png";
        
        try{
            bufferedImage = ImageIO.read(new File(pathicon));
        } catch (IOException ex) {
            Logger.getLogger(MenuPembeli_07342.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        gambarresize = bufferedImage.getScaledInstance(400, 350,    Image.SCALE_SMOOTH);
        bingkaigambar.setIcon(new ImageIcon(gambarresize));
        
        btnnotregP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btnnotregP.setForeground(Color.black);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnnotregP.setForeground(Color.white);
            }
        });
        btnnotregP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new RegisterPembeliGui_07342().setVisible(true);
            }
        });
        
        btnLDP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btnLDP.setForeground(Color.black);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnLDP.setForeground(Color.white);
            }
        });
        
        btnLDP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                PembeliGui_07342 pem = new PembeliGui_07342();
                pem.setVisible(true);
            }
        });
        
    }
}

