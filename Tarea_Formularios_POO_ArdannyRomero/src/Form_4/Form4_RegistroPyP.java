package Form_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class Form4_RegistroPyP {
    private JLabel title_lab;
    private JLabel nombre_lab;
    private JLabel apellido_lab;
    private JLabel edad_lab;
    private JLabel telefono_lab;
    private JLabel genero_lab;
    private JLabel deporte_lab;
    private JLabel barrio_lab;
    private JLabel registros_lab;

    private JTextField nombre_field;
    private JTextField apellido_field;
    private JTextField edad_field;
    private JTextField telefono_field;

    private JRadioButton masculinoRadioButton;
    private JCheckBox futbolCheckBox;
    private JCheckBox basquetCheckBox;
    private JCheckBox tenisCheckBox;
    private JCheckBox natacionCheckBox;
    private JComboBox comboBox1;
    private JTable table1;
    private JPanel panel_1;
    private JButton limpiarButton;
    private JButton registrarButton;
    private JRadioButton femeninoRadioButton;


    public Form4_RegistroPyP() {
        DefaultTableModel model = new DefaultTableModel(); // Esto no lo mencione antes, pero es para definir las columnas d euna tabla
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Edad");
        model.addColumn("Teléfono");
        model.addColumn("Género");
        model.addColumn("Deportes");
        model.addColumn("Barrio");
        table1.setModel(model);

        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombre_field.getText();
                String apellido = apellido_field.getText();
                String edad = edad_field.getText();
                String telefono = telefono_field.getText();

                String genero = masculinoRadioButton.isSelected() ? "Masculino" :
                        femeninoRadioButton.isSelected() ? "Femenino" : "No especificado";

                StringBuilder deportes = new StringBuilder();
                if (futbolCheckBox.isSelected()) deportes.append("Fútbol ");
                if (basquetCheckBox.isSelected()) deportes.append("Básquet ");
                if (tenisCheckBox.isSelected()) deportes.append("Tenis ");
                if (natacionCheckBox.isSelected()) deportes.append("Natación ");

                String barrio = comboBox1.getSelectedItem().toString();

                model.addRow(new Object[]{
                        nombre, apellido, edad, telefono, genero, deportes.toString().trim(), barrio
                });
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre_field.setText("");
                apellido_field.setText("");
                edad_field.setText("");
                telefono_field.setText("");

                masculinoRadioButton.setSelected(false);
                femeninoRadioButton.setSelected(false);

                futbolCheckBox.setSelected(false);
                basquetCheckBox.setSelected(false);
                tenisCheckBox.setSelected(false);
                natacionCheckBox.setSelected(false);

                comboBox1.setSelectedIndex(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro");
        frame.setContentPane(new Form4_RegistroPyP().panel_1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
