import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HolaMundo extends JFrame{
    private JTextField textField1;
    private JButton saludarButton;
    private JPanel PanelPrincipal;

    public HolaMundo (){
        setTitle(" Hola Mundo Wiz");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        saludarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textField1.getText ();
                if (nombre.isEmpty()){
                    JOptionPane.showMessageDialog(HolaMundo.this,"Bienvenido amigo desconocido");
                }else {
                    JOptionPane.showMessageDialog(HolaMundo.this,"Bienvenido"+nombre);
                }
            }
        });
    }

    public static void main (String[] ergs){
        new HolaMundo();
    }
}

