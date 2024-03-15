public class PrimitivosFlotante {
    public static void main(String[] args) {

        float realFloat = 1.0f;
        System.out.println("realFloat: " + realFloat);
        System.out.println("float corresponde en byte a: " + Float.BYTES);
        System.out.println("float corresponde en bites a: " + Float.SIZE);
        System.out.println("El valor máximo de float es: " + Float.MAX_VALUE);
        System.out.println("El valor mínimo de float es: " + Float.MIN_VALUE);

        double realDouble = 1.0d;
        System.out.println("realDouble: " + realDouble);
        System.out.println("double corresponde en byte a: " + Double.BYTES);
        System.out.println("double corresponde en bites a: " + Double.SIZE);
        System.out.println("El valor máximo de double es: " + Double.MAX_VALUE);
        System.out.println("El valor mínimo de double es: " + Double.MIN_VALUE);

    }
}
