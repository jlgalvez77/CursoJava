import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingresa un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Se debe introducir un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        System.out.println("Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));


    }
}
