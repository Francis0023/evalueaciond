import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 {
    JPanel panel2;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton salirRadioButton;

    // Variable para almacenar el saldo actual

    public form2() {
        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mensaje de confirmacion
                JOptionPane.showMessageDialog(panel2, "Muchas Gracias ");
                // Cerrar pantalla actual
                Main.pantalla2.dispose();

                //Abrir otra pantalla
                Main.frame3.setContentPane(new form3().panel3);
                Main.frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Main.frame3.pack();
                Main.frame3.setSize(850,420);
                Main.frame3.setVisible(true);

            }
        });

        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mensaje de confirmacion
                JOptionPane.showMessageDialog(panel2, "Muchas Gracias ");
                // Cerrar pantalla actual
                Main.pantalla2.dispose();

                //Abrir otra pantalla
                Main.frame4.setContentPane(new form4().panel4);
                Main.frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Main.frame4.pack();
                Main.frame4.setSize(850,420);
                Main.frame4.setVisible(true);

            }
        });
        depositoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mensaje de confirmacion
                JOptionPane.showMessageDialog(panel2, "Muchas Gracias ");
                // Cerrar pantalla actual
                Main.pantalla2.dispose();
                //Abrir otra pantalla
                Main.frame5.setContentPane(new form5().panel5);
                Main.frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Main.frame5.pack();
                Main.frame5.setSize(850,420);
                Main.frame5.setVisible(true);

            }
        });

        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.pantalla2.dispose();
                //Abrir otra pantalla de la contraseña
                Main.pantalla1.setContentPane(new form1().panel1);
                Main.pantalla1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Main.pantalla1.pack();
                Main.pantalla1.setSize(850,420);
                Main.pantalla1.setVisible(true);


            }
        });

    }

}
