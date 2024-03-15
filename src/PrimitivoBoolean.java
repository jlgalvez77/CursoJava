public class PrimitivoBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("datoLogico: " + datoLogico);

        double d = 98564.43e-3;
        System.out.println("d = " + d);
        
        float f = 1.2424e5f;
        System.out.println("f = " + f);

        datoLogico = d > f;
        System.out.println("datoLógico: " + datoLogico);

        boolean esIgual = 3 - 2 == 1;
        System.out.println("esIgual = " + esIgual);
    }
}
