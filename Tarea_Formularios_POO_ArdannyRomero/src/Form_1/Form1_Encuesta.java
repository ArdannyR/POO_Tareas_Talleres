package Form_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1_Encuesta {
    private JPanel panel_1;

    private JTextField nombre_field;
    private JTextField edad_field;
    private JTextField apellido_field;

    private JLabel nombre_lab;
    private JLabel apellido_lab;
    private JLabel edad_lab;
    private JLabel resultados_lab;

    private JButton limpiar_Button;
    private JButton verificar_Button;

    public Form1_Encuesta() {
        verificar_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int edad = Integer.parseInt(edad_field.getText()); // Con eso paso de txt a int
                String nombre = nombre_field.getText();
                String apellido = apellido_field.getText();

                if (edad >= 18) {
                    resultados_lab.setText(String.format("%s %s es mayor de edad.", nombre, apellido));
                } else {
                    resultados_lab.setText(String.format("%s %s no cumple con el requisito de edad.", nombre, apellido));
                }
            }


        });
        limpiar_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre_field.setText("");
                apellido_field.setText("");
                edad_field.setText("");
                resultados_lab.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Encuesta");
        frame.setContentPane(new Form1_Encuesta().panel_1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
