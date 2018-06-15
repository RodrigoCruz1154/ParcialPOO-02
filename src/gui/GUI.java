package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

/**
 *
 * @author acer
 */
public class GUI extends JFrame{
    private JTextField texto,caja2;
    private JButton boton;
    private JTextArea jTextArea1;
    private JScrollPane scroll;
    
    public GUI(){
        super("Información - RodrigoCruz's World");
        initialComponents();
        boton.addActionListener((ActionEvent e) -> {
            caja2.setText(texto.getText());
        });
    }
    
    public void initialComponents(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setLayout(null);
        
        texto = new JTextField("      ¡Bienvenido a Omega Land!\n\n  En los botones de abajo obtendrás\n   más información sobre el juego.");
        texto.setBounds(80, 200, 200, 100);
        caja2 = new JTextField("");
        caja2.setBounds(80, 100, 150, 30);
        
        texto.setEditable(false);
        
        boton = new JButton(":v");
        boton.setBounds(40,200, 200, 30);
        
        Container container = getContentPane();
        
        container.add(texto);
        container.add(caja2);
        container.add(boton);
        
        setSize(500,500);
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }
}
