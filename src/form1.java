import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    JPanel panel1;
    private JPasswordField passwordField1;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton enterButton;

    public form1() {
        // Agregar ActionListener para cada botón numérico
        ActionListener buttonActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                String digit = clickedButton.getText();
                passwordField1.setText(passwordField1.getText() + digit);
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
                    String password = passwordField1.getText();

                    // Coloca aquí el código que pueda lanzar una excepción si la contraseña no es correcta
                    if (!password.equals("1234")) {
                        throw new Exception("Contraseña incorrecta");
                    }

                    // Si no hay excepción, significa que la contraseña es correcta
                    JOptionPane.showMessageDialog(panel1, "Contraseña correcta ");


                    // Cerrar la pantalla de ingreso
                    Main.pantalla1.dispose();
                    // Asegúrate de tener acceso a la instancia de Main.pantalla1
                    // Ventana 2 (Pantalla2)
                    //establece el contenido de la ventana
                    Main.pantalla2.setContentPane(new form2().panel2);
                    //establece la operacion por defecto cuando la ventana se cierra
                    Main.pantalla2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    //empaqueta los componentes
                    Main.pantalla2.pack();
                    Main.pantalla2.setSize(850,420);
                    Main.pantalla2.setVisible(true);

                    // Mostrar el menú en una nueva pantalla
                } catch (Exception ex) {
                    // Manejar la excepción (contraseña incorrecta)
                    JOptionPane.showMessageDialog(panel1, "Contraseña Incorrecta ");
                    passwordField1.setText("");
                }

            }
        });
    }
}
