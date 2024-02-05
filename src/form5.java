import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form5 {
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
    private JButton menuButton;
    JPanel panel5;

    public form5() {
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Cierra la pantalla
                Main.frame5.dispose();
                //establece la operacion por defecto cuando la ventana se cierra
                Main.pantalla2.setContentPane(new form2().panel2);
                //Establece el contenido de la ventana

                Main.pantalla2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //empaqueta los componentes
                Main.pantalla2.pack();
                Main.pantalla2.setSize(850,420);
                Main.pantalla2.setVisible(true);
            }
        });
    }
}
