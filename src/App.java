
//librería para poder leer de la consola
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Variable que nos permitirá mantener el ciclo
        int op = 0;
        // Declaramos leer para poder pedir los datos por consola.
        Scanner leer = new Scanner(System.in);

        // Por medio de un While podremos mantener el mientra op sea distinto a
        // 5.(Salir)
        while (op != 5) {

            // Escribimos por consola todas las opciones que tiene nuestro menú.
            System.out.println("Digite el programa a ejecutar:\n"
                    + "(1). Cantidad de cifras de un número: Dado un número, el algoritmo debe informar cuántos dígitos tiene, cuántos de estos son pares y cual es el dígito mayor.\n"
                    + "(2). Adivina qué número estoy pensando: El usuario debe pensar aleatoriamente un número entre 0 y 99 y el programa debe adivinarlo siguiendo las pistas del usuario. Las pistas que se deben dar son si el número que va generando el programa es mayor o menor que el pensado, así hasta que lo adivine. Debe mostrar la cantidad de intentos que tuvo para adivinar el número, si adivina en menos de 3 intentos informarle que es un GENIO, si lo hace entre 4 y 6 decirle que LO HIZO BIEN, si adivina entre 7 y 10 intentos, DEBE MEJORAR. Después de 10 intentos informar: “partida perdida”.\n"
                    + "(3). Multiplicar dos enteros positivos: Dados 2 números, calcular su producto por medio de sumas sucesivas.\n"
                    + "(4). Factorial de un número: Dado un entero positivo, calcular su factorial.\n" + "(5). Salir");

            // Leemos por pantalla la opción que desea ejecutar nuestro usuario (1, 2, 3, 4,
            // 5)
            op = leer.nextInt();

            // Usamos un switch para ejecutar la acción dependiendo a la opción seleccionada
            // por el usuario(Se pudo haber usado condicionales)
            switch (op) {
                case 1:
                    int n, n1, m, cant = 0, par = 0;
                    System.out.println("Opción 1");
                    System.out.println("---------------------------");
                    System.out.println("Digite un número");
                    // Le pedimos al usuario que digite el numero que desee
                    n = leer.nextInt();
                    // Guardamos en una variable temporal ese número
                    n1 = n;
                    // En esta variable guardaremos el dígito mayor del número.
                    m = 0;

                    while (n > 0) {
                        // Gracias al mod 10 podemos saber el primer dígito de un numero, y aprovechamos
                        // y preguntamos si es mayor a m
                        if ((n % 10) > m) {
                            // Si es mayor a m, entonces le asignamos a m el dígito que se estaba evaluando
                            m = n % 10;
                        }
                        // Condición para saber si la cifra e spar
                        if ((n % 10) % 2 == 0) {
                            par++;
                        }
                        // Por medio de esta operación podemos "quitar" el dígito que ya se evaluó
                        n = n / 10;
                        // Contamos la cantidad de dígitos evaluados es igual a hacer cant = cant + 1;
                        cant++;
                    }
                    System.out.println("---------------------------");
                    // Escribimos el resultado
                    System.out.println(n1 + " tiene " + cant + " dígitos y su dígito mayor es " + m + " y tiene " + par
                            + " dígitos pares");
                    System.out.println("---------------------------");
                    break;

                case 2:
                    System.out.println("Opción 2");
                    System.out.println("---------------------------");
                    int numero = 0, tempNum = 0;
                    // Variable qu enos permitirá romper el ciclo en caso de que se adivine el
                    // número
                    // sw será falso cuando se haya adivinado
                    boolean sw = true;
                    int correcto = 1, mayor = 1;
                    // Pedimos al usuario que piense un numero entre 0 y 99
                    System.out.println("Piense un numero entre el 0 y el 99 ");
                    // inicializamos nuestro contador, porque la aplicación solo tendrá 10 intentos
                    // para adivinar
                    int contador = 0;
                    // Verificamos que los intentos sea <10 y que el número aún no se haya adivinado
                    // Debe cumplirse estas dos opciones.
                    while (contador < 10 && sw == true) {
                        // Garantizamos que la primera vez entre a esta condición
                        if (contador == 0) {
                            // Generamos un número aleatorio hasta 99
                            numero = (int) (Math.random() * 99);
                        }
                        // Preguntamos por el numero generado.
                        System.out.println("¿El número que pensó fue " + numero + "? (1) SI. (2)NO.");
                        correcto = leer.nextInt();
                        // Si es correcto cambiamos nuestro sw a false, con lo que saríamos
                        // inmediatamente del ciclo.
                        // Incrementamos nuestro contador para saber cuantos intentos van.
                        contador++;
                        if (correcto == 1) {
                            sw = false;
                        } else {
                            // Preguntamos si el numero generado es mayor o menor al pensado.

                            System.out.println("¿El número que pensó es (1) MAYOR o (2) MENOR que " + numero + "? ");
                            mayor = leer.nextInt();
                            // Guardamos el numero en una variable temporal
                            tempNum = numero;

                            if (mayor == 1) {
                                // Si el numero que pensó es mayor al generado
                                // Creamos otro numero aleatorio a partir del numero generado
                                numero = (int) (Math.random() * 99) + tempNum;
                            } else {
                                // Sino o sea que el número que se pensó es menor al generado
                                // Creamos otro número aleatorio que vaya hasta el numero generado
                                numero = (int) (Math.random() * tempNum);
                            }

                        }

                    }

                    System.out.println("---------------------------");
                    // Escribimos la cantidad de intentos
                    System.out.println("Cantidad de intentos " + contador);
                    // Si sw == true quiere decir que el numero no se adivinó o sea que los intentos
                    // superaron los permitidos
                    if (sw) {
                        System.out.println("partida perdida");
                    } else if (contador <= 3) {
                        System.out.println("Eres un GENIO");
                    } else if (contador <= 6) {
                        System.out.println("LO HICISTE BIEN");
                    } else if (contador <= 10) {
                        System.out.println("DEBE MEJORAR");
                    }
                    System.out.println("---------------------------");
                    break;
                case 3:
                    System.out.println("Opción 3");
                    System.out.println("---------------------------");
                    int num1 = 0, num2 = 0, suma = 0;
                    // Pedimos los dos números
                    System.out.print("Digite el numero 1: ");
                    num1 = leer.nextInt();
                    System.out.print("Digite el numero 2: ");
                    num2 = leer.nextInt();
                    // Hacemos un para
                    // Por la propiedad conmutativa de la multiplicacion pudimos haber hecho nuestro
                    // para hasta el número 2 y obtener el mismo resultado
                    for (int i = 0; i < num1; ++i) {
                        suma = suma + num2;
                    }
                    System.out.println("---------------------------");
                    System.out.println(
                            "El producto de " + num1 + " y " + num2 + " por medio de sumas sucesivas es: " + suma);

                    System.out.println("---------------------------");

                    break;
                case 4:
                    int nume = 0, fact = 1;
                    System.out.println("Opción 4");
                    System.out.println("---------------------------");
                    // Pedimos un numero
                    System.out.println("Digite un número entero positivo");
                    nume = leer.nextInt();
                    // Hacemos un para donde recorremos todos los numeros empezando en 1 hasta el
                    // numero actual.
                    for (int i = 1; i < nume + 1; ++i) {
                        fact = fact * i;
                    }
                    System.out.println("---------------------------");
                    System.out.println("El factorial de " + nume + " es: " + fact);
                    System.out.println("---------------------------");

                    break;
                case 5:
                    // En caso de que la opción sea 5 debido a nuestro while el programa se saldrá.
                    // Imprimimos en pantalla un mensaje de despedida
                    System.out.println("Adiós");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
