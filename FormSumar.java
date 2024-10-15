import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormSumar extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumarButton;
    private JPanel panell;
    private JTextField textField3;

    public FormSumar (){

        setContentPane(panell);

        setTitle("Formulario para la suma de 2 números");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x,y,s;
                x=Integer.parseInt(textField1.getText());
                y=Integer.parseInt(textField2.getText());

                s=x+y;
                textField3.setText(Double.toString(s));
            }
        });
    }
    public static void main (String[] ergs){
        new FormSumar();
    }
}
