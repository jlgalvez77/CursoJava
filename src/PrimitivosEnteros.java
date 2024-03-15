public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 7;
        System.out.println("Número Byte " + numeroByte);
        System.out.println("Tipo Byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("Tipo Byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("Valor máximo de un Byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un Byte: " + Byte.MIN_VALUE);

        Short numeroShort = 30000;
        System.out.println("Número Short " + numeroShort);
        System.out.println("Tipo Short corresponde en byte a: " + Short.BYTES);
        System.out.println("Tipo Short corresponde en bites a: " + Short.SIZE);
        System.out.println("Valor máximo de un Sgort: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un Short: " + Short.MIN_VALUE);

        int numeroInt = 7252400 ;
        System.out.println("Número Int " + numeroInt);
        System.out.println("Tipo Int corresponde en byte a: " + Integer.BYTES);
        System.out.println("Tipo Int corresponde en bites a: " + Integer.SIZE);
        System.out.println("Valor máximo de un Int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un Int: " + Integer.MIN_VALUE);

        long numeroLong = 725124452400L;
        System.out.println("Número long " + numeroLong);
        System.out.println("Tipo long corresponde en byte a: " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);
    }
}
