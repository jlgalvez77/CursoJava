public class HolaMundo {
    public static void main(String[]args){
        String greeting = "Hello World in JAVA!!!";
        System.out.println(greeting);
        System.out.println("greeting.toUpperCase() = " + greeting.toUpperCase());

        int number = 10;
        System.out.println("number = " + number);
        boolean value = true;

        int number2 = 5;
        if (value){
            System.out.println("number = " + number);
            number2 = 20;
        }
        System.out.println("number2 = " + number2);

        String nombre;

        nombre = "Andrés";

        //int class = 4   No se pueden nombrar las variables con un nombre de una palabra reservada

        // Pueden empezar con guión bajo _ o con el simbolo $
        int $number = 20;
        int _number = 30;
    }
}
