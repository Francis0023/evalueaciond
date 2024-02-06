import javax.swing.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static JFrame pantalla1 =new JFrame("Bienvenido al Banco Buho");
    static JFrame pantalla2 =new JFrame("Trancsacción a realizar:");

    static JFrame frame3 = new JFrame("Saldo");
    static JFrame frame4 = new JFrame("Retiro");
    static JFrame frame5 = new JFrame("Deposito");

    public static void main(String[] args) {
        pantalla1.setContentPane(new form1().panel1);
        pantalla1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla1.pack();
        pantalla1.setSize(850,420);
        pantalla1.setVisible(true);
    }
}