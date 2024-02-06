import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form3 {
    private JButton menuButton;
    JPanel panel3;
    private JLabel saldoLabel;

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
                Main.pantalla2.setSize(850, 420);
                Main.pantalla2.setVisible(true);
            }
        });
    }

    // Método para actualizar el saldo desde otras clases
    public void actualizarSaldo(double nuevoSaldo) {
        saldo=nuevoSaldo;
        // Implementa la lógica para actualizar el saldo aquí
        saldoLabel.setText("Saldo actual: $" + nuevoSaldo);
    }

    // Método para obtener el saldo actual
    public static double getSaldo() {
        // Implementa la lógica para obtener el saldo actual aquí
        return 200; // Cambia esto con tu implementación real
    }

    public void actualizarSaldoDesdeRetiro(double nuevoSaldo) {
        // Actualiza el texto del saldo en la etiqueta con el nuevo saldo
        saldoLabel.setText("Saldo: $" + nuevoSaldo);
    }


}

