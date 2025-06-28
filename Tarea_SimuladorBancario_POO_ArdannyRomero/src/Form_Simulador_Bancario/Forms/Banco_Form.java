package Form_Simulador_Bancario.Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Banco_Form extends JFrame{
    private JPanel Operaciones_panel;
    private JPanel historial_panel;

    private JLabel title_lab;
    private JLabel user_lab;
    private JLabel saldo_word_lab;
    private JLabel saldo_num_lab;
    private JLabel title_historial_panel_lab;

    private JButton depositoButton;
    private JButton retiroButton;
    private JButton transferenciaButton;
    private JButton salirButton;

    private JTextArea historial_transf_txtar;

    public Banco_Form(){
        setTitle("Operaciones Bancarias Ardanny Romero");
        setContentPane(Operaciones_panel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400,200);
        setLocationRelativeTo(null);
        setVisible(true);

        historial_panel.setVisible(false);
        saldo_num_lab.setText("1000"); // La IA me dijo que era buena parctica hacer esto, por algo de variables vacias

        depositoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String monto_str = JOptionPane.showInputDialog(null, "Ingrese el monto a depositar:");
                if (monto_str != null && !monto_str.trim().isEmpty()) {
                    try {
                        double monto = Double.parseDouble(monto_str);
                        if (monto >= 0){
                            String saldo_str = saldo_num_lab.getText().replace(".", "").replace(",", "."); // Daba errores con los . y , asi que esta liena es para remplazarlos para su correcto manejo
                            double saldo = Double.parseDouble(saldo_str);

                            double new_saldo_d = saldo + monto;

                            String new_saldo = String.format("%.2f", new_saldo_d).replace(".", ","); // Lo mismo aqui
                            saldo_num_lab.setText(new_saldo);
                            JOptionPane.showMessageDialog(null, String.format("Depósito de $%.2f realizado con éxito", monto));
                        } else {
                            JOptionPane.showMessageDialog(null, "Monto invalido. Intente nuevamente.");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Tipo de dato invalido. Intente nuevamente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se ingreso ningun monto.");
                }
            }
        });
        retiroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // Es un porcedimiento similar al anterior asi que hice ctrl c + v para la estructura
                String monto_str = JOptionPane.showInputDialog(null, "Ingrese el monto a retirar:");
                if (monto_str != null && !monto_str.trim().isEmpty()) {
                    try {
                        double monto = Double.parseDouble(monto_str);
                        String saldo_str = saldo_num_lab.getText().replace(".", "").replace(",", ".");
                        double saldo = Double.parseDouble(saldo_str);

                        if (monto <= saldo) {
                            double new_saldo_d = saldo - monto;
                            String new_saldo = String.format("%.2f", new_saldo_d).replace(".", ","); // Lo mismo aqui
                            saldo_num_lab.setText(new_saldo);
                            JOptionPane.showMessageDialog(null, String.format("Retiro de $%.2f realizado con éxito", monto));
                        } else {
                            JOptionPane.showMessageDialog(null, "Monto invalido. Intente nuevamente.");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Tipo de dato invalido. Intente nuevamente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se ingreso ningun monto.");
                }
            }
        });
        transferenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario_externo = JOptionPane.showInputDialog(null, "Ingrese el nombre del destinatario:");
                String monto_str = JOptionPane.showInputDialog(null, "Ingrese el monto de la transferencia:");
                if (monto_str != null && !monto_str.trim().isEmpty() || usuario_externo != null && !usuario_externo.trim().isEmpty()) {
                    try {
                        double monto = Double.parseDouble(monto_str);
                        String saldo_str = saldo_num_lab.getText().replace(".", "").replace(",", ".");
                        double saldo = Double.parseDouble(saldo_str);

                        if (monto <= saldo) {
                            double new_saldo_d = saldo - monto;
                            String new_saldo = String.format("%.2f", new_saldo_d).replace(".", ","); // Lo mismo aqui
                            saldo_num_lab.setText(new_saldo);
                            JOptionPane.showMessageDialog(null, String.format("La transaccion de $%.2f a %s fue exitosa", monto, usuario_externo));

                            historial_panel.setVisible(true);
                            setSize(400,350);
                            historial_transf_txtar.append(String.format("\n - %s \t\t$%s ", usuario_externo, monto_str));
                        } else {
                            JOptionPane.showMessageDialog(null, "Monto invalido. Intente nuevamente.");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Tipo de dato invalido. Intente nuevamente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se ingreso ningun monto.");
                }
                // Nota hay un scroll en esta patalla mas no esta nombrado, esto es porque lo incoque con una opcion que dan los elementos en el .form
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
