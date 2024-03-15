public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println(caracter);
        System.out.println(decimal);
        System.out.println("caracter = decimal?: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println(simbolo);
        System.out.println("Simbolo = caracter?: " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte:" + Character.BYTES);
        System.out.println("char corresponde en bites:" + Character.SIZE);
        System.out.println("Valor màximo de char: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de char: " + Character.MIN_VALUE);
    }
}
