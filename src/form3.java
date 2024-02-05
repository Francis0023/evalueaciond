import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form3 {
    private JButton menuButton;
    JPanel panel3;
    static JLabel saldoLabel;

    // Variable para almacenar el saldo actual
    private static double saldo = 200; // Ejemplo: Saldo inicial de 1000 dólares

    public form3() {
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame3.dispose();
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

    // Método para actualizar el saldo desde otras clases (como form4)
    public static void actualizarSaldo(double nuevoSaldo) {
        saldo = nuevoSaldo;
        // Actualizar el texto del saldo en la etiqueta
        saldoLabel.setText("Saldo: $" + saldo);
    }

    // Método para obtener el saldo actual
    public static double getSaldo() {
        return saldo;
    }
}
