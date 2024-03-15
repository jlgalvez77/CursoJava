import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScaanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero:");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        } catch (Exception e) {
            System.out.println("Debes ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        System.out.println("Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));


    }
}
