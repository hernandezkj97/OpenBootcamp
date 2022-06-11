// Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
// Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

// Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

// Incrementar el valor de la variable en uno cada vez que se ejecute.

// Mostrarlo por pantalla cada vez que se ejecute.

// Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

// Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

// Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

public class Main {
    public static void main(String[] args) {
        int numeroIf = 5;
        CondionalIf(numeroIf);
        int numeroWhile = 0;
        CondionalWhile(numeroWhile);
        int numeroDoWhile = 0;
        CondionalDoWhile(numeroDoWhile);
        int numeroFor = 0;
        CondionalFor(numeroFor);
        String estacion = "1";
        CondionalSwitch(estacion);
    }
    public static void CondionalIf(int numeroIf) {
        if (numeroIf > 0) {
            System.out.println("El numero es positivo \n" );
        }else if (numeroIf < 0) {
            System.out.println("El numero es negativo \n");
        } else {
            System.out.println("El numero es 0 \n");
        }
    }

    public static void CondionalWhile(int numeroWhile) {
        while (numeroWhile < 3) {
            System.out.println(numeroWhile );
            numeroWhile++;
        }
        System.out.println("\n Fin del bucle While \n");
    }

    public static void CondionalDoWhile(int numeroDoWhile) {
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
        System.out.println("\n Fin del bucle Do While \n");
    }

    public static void CondionalFor(int numeroFor) {
        for (int i = 0; i <= 3; i++) {
            System.out.println(numeroFor );
            numeroFor++;
        }
        System.out.println(" \n Fin del bucle For \n");
    }

    public static void CondionalSwitch(String estacion) {
        switch (estacion) {
            case "1":
                System.out.println("Estamos en la estacion de Primavera \n");
                break;
            case "2":
                System.out.println("Estamos en la estacion de verano \n");
                break;
            case "3":
                System.out.println("Estamos en la estacion de Otoño \n");
                break;
            case "4":
                System.out.println("Estamos en la estacion de Invierno \n");
                break;
            default:
                System.out.println("No es una estacion \n");
                break;
        }
    }
}