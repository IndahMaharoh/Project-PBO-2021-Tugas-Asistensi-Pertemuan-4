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

public class Menu_07342 extends ComponentGui_07342 {
    JButton btnloginadmin = new JButton();
    String pathicon;
    
    public Menu_07342(){
        initComponent();
    }
    
    void initComponent(){
        setTitle("MENU");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,350);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.gray.brighter());
        setLayout(null);
        setVisible(true);
        
        btnTrx.setBounds(120, 50, 160, 25);
        btnTrx.setBackground(Color.blue.brighter());
        btnTrx.setForeground(Color.WHITE);
        btnTrx.setBorder(null);
        add(btnTrx);
        
        btnAdmin.setBounds(170, 100, 70, 25);
        btnAdmin.setBackground(Color.blue.brighter());
        btnAdmin.setForeground(Color.WHITE);
        btnAdmin.setBorder(null);
        add(btnAdmin);
        
        btnPembeli.setBounds(120, 150, 160, 25);
        btnPembeli.setBackground(Color.blue.brighter());
        btnPembeli.setForeground(Color.WHITE);
        btnPembeli.setBorder(null);
        add(btnPembeli);
        
        bingkaigambar.setBounds(0, 0, 400, 350);
        add(bingkaigambar);
        
        pathicon = "./src/Images/g1.png";
        
        try{
            bufferedImage = ImageIO.read(new File(pathicon));
        } catch (IOException ex) {
            Logger.getLogger(Menu_07342.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        gambarresize = bufferedImage.getScaledInstance(400, 350,    Image.SCALE_SMOOTH);
        bingkaigambar.setIcon(new ImageIcon(gambarresize));
        
        
        btnTrx.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                btnTrx.setForeground(Color.black);
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                btnTrx.setForeground(Color.white);
            }
        });
        
        btnTrx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuTransaksi_07342 trx = new MenuTransaksi_07342();
                trx.setVisible(true);
            }
        });
        
        btnAdmin.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                btnAdmin.setForeground(Color.black);
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                btnAdmin.setForeground(Color.white);
            }
        });
        
        btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginAdminGui_07342 loginA = new LoginAdminGui_07342();
                loginA.setVisible(true);
            }
        });
        
        btnPembeli.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btnPembeli.setForeground(Color.black);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnPembeli.setForeground(Color.white);
            }
        });
        
        btnPembeli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuPembeli_07342 menuPem = new MenuPembeli_07342();
                menuPem.setVisible(true);
            }
        });
        
    }
}

