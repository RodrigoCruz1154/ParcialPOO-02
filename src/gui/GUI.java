package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author acer
 */
public class GUI extends JFrame{
    private JTextField texto,caja2;
    private JButton boton;
    
    public GUI(){
        super("Información - RodrigoCruz's World");
        initialComponents();
        boton.addActionListener((ActionEvent e) -> {
            caja2.setText(texto.getText());
        });
    }
    
    public void initialComponents(){
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        texto = new JTextField("SoS");
        texto.setBounds(80, 100, 150, 30);
        caja2 = new JTextField("");
        caja2.setBounds(80, 100, 150, 30);
        
        caja2.setEditable(false);
        
        boton = new JButton(":v");
        boton.setBounds(40,200, 200, 30);
        
        Container container = getContentPane();
        
        container.add(texto);
        container.add(caja2);
        container.add(boton);
        
        
        setSize(300,300);
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
           
        });
    }
}
