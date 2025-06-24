package Form_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form2_TestJava {
    private JRadioButton res_A_preg_1_RadioButton;
    private JRadioButton res_B_preg_1_RadioButton;
    private JRadioButton res_C_preg_1_RadioButton;
    private JRadioButton res_A_preg_2_RadioButton;
    private JRadioButton res_B_preg_2_RadioButton;
    private JRadioButton res_C_preg_2_RadioButton;
    private JRadioButton res_T_preg_3;
    private JRadioButton res_F_preg_3;

    private JButton verResultadoButton;
    private JButton inactvarRespuestasButton;
    private JButton limpiarSeleccionesButton;

    private JLabel titulo_lab;
    private JLabel pregunta_1_lab;
    private JLabel pregunta_2_lab;
    private JLabel pregunta_3_lab;
    private JLabel res_A_preg_1;
    private JLabel res_B_preg_1;
    private JLabel res_C_preg_1;
    private JLabel res_A_preg_2;
    private JLabel res_B_preg_2;
    private JLabel res_C_preg_2;

    private JPanel panel_1;

    public Form2_TestJava() {

        // --- Agrupación de RadioButtons ---
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(res_A_preg_1_RadioButton);
        bg1.add(res_B_preg_1_RadioButton);
        bg1.add(res_C_preg_1_RadioButton);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(res_A_preg_2_RadioButton);
        bg2.add(res_B_preg_2_RadioButton);
        bg2.add(res_C_preg_2_RadioButton);

        ButtonGroup bg3 = new ButtonGroup();
        bg3.add(res_T_preg_3);
        bg3.add(res_F_preg_3);

        verResultadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int puntaje = 0;

                if (res_B_preg_1_RadioButton.isSelected()) {
                    puntaje += 5;
                }
                if (res_C_preg_2_RadioButton.isSelected()) {
                    puntaje += 5;
                }
                if (res_T_preg_3.isSelected()) {
                    puntaje += 5;
                }

                JOptionPane.showMessageDialog(panel_1, "Tu puntaje es: " + puntaje + " / 15");
            }
        });
        inactvarRespuestasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                res_A_preg_1_RadioButton.setEnabled(false);
                res_B_preg_1_RadioButton.setEnabled(false);
                res_C_preg_1_RadioButton.setEnabled(false);

                res_A_preg_2_RadioButton.setEnabled(false);
                res_B_preg_2_RadioButton.setEnabled(false);
                res_C_preg_2_RadioButton.setEnabled(false);

                res_T_preg_3.setEnabled(false);
                res_F_preg_3.setEnabled(false);
            }
        });
        limpiarSeleccionesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar la selección de cada grupo de preguntas
                bg1.clearSelection();
                bg2.clearSelection();
                bg3.clearSelection();

                // Habilitar todos los radio buttons nuevamente
                res_A_preg_1_RadioButton.setEnabled(true);
                res_B_preg_1_RadioButton.setEnabled(true);
                res_C_preg_1_RadioButton.setEnabled(true);

                res_A_preg_2_RadioButton.setEnabled(true);
                res_B_preg_2_RadioButton.setEnabled(true);
                res_C_preg_2_RadioButton.setEnabled(true);

                res_T_preg_3.setEnabled(true);
                res_F_preg_3.setEnabled(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Encuesta");
        frame.setContentPane(new Form2_TestJava().panel_1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
