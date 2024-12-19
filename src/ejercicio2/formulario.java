package ejercicio2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario extends JFrame {
    public JPanel panelIngreso;
    private JTextField textField1;
    private JTextField textField2;
    private JButton enviarButton;

    public formulario(JFrame frame) {
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula=String.copyValueOf(textField1.getText().toCharArray());

            }
        });
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
