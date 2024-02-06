import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form4 {
    private JTextField $TextField;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton enterButton;
    JPanel panel4;
    private JButton menuButton;
    private double saldo = 200; // Ejemplo: Saldo inicial de 1000 dólares




    public form4() {
        // Agregar ActionListener para cada botón numérico
        ActionListener buttonActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                String digit = clickedButton.getText();
                $TextField.setText($TextField.getText() + digit);
            }
        };

        a1Button.addActionListener(buttonActionListener);
        a2Button.addActionListener(buttonActionListener);
        a3Button.addActionListener(buttonActionListener);
        a4Button.addActionListener(buttonActionListener);
        a5Button.addActionListener(buttonActionListener);
        a6Button.addActionListener(buttonActionListener);
        a7Button.addActionListener(buttonActionListener);
        a8Button.addActionListener(buttonActionListener);
        a9Button.addActionListener(buttonActionListener);
        a0Button.addActionListener(buttonActionListener);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double monto = Double.parseDouble($TextField.getText());

                    // Validar si el monto es mayor que el saldo
                    if (monto > form3.getSaldo()) {
                        JOptionPane.showMessageDialog(panel4, "Fondos insuficientes");
                    } else {
                        // Llamar al método realizarRetiro de form2
                        form2.realizarRetiro(monto);

                        // Llamar al método actualizarSaldo de form3
                        form3 form3Instance = new form3();
                        form3Instance.actualizarSaldo(form3Instance.getSaldo() - monto);
                        //JOptionPane.showMessageDialog(panel4, "Retiro exitoso. Saldo actualizado: $" + form3Instance.getSaldo());
                    }

                } catch (Exception ex) {
                    // Manejar la excepción (contraseña incorrecta)
                    JOptionPane.showMessageDialog(panel4, "Valor incorrecto ");
                    $TextField.setText("");
                }

            }
        });

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame4.dispose();
                //Establece el contenido de la ventana
                Main.pantalla2.setContentPane(new form2().panel2);
                //establece la operacion por defecto cuando la ventana se cierra
                Main.pantalla2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //empaqueta los componentes
                Main.pantalla2.pack();
                Main.pantalla2.setSize(850,420);
                Main.pantalla2.setVisible(true);
            }
        });


    }
}
