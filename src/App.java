import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int op = 0;
        Scanner leer = new Scanner(System.in);
        while (op != 5) {
            System.out.println("Digite el programa a ejecutar:\n"
                    + "(1). Cantidad de cifras de un número: Dado un número, el algoritmo debe informar cuántos dígitos tiene, cuántos de estos son pares y cual es el dígito mayor.\n"
                    + "(2). Adivina qué número estoy pensando: El usuario debe pensar aleatoriamente un número entre 0 y 99 y el programa debe adivinarlo siguiendo las pistas del usuario. Las pistas que se deben dar son si el número que va generando el programa es mayor o menor que el pensado, así hasta que lo adivine. Debe mostrar la cantidad de intentos que tuvo para adivinar el número, si adivina en menos de 3 intentos informarle que es un GENIO, si lo hace entre 4 y 6 decirle que LO HIZO BIEN, si adivina entre 7 y 10 intentos, DEBE MEJORAR. Después de 10 intentos informar: “partida perdida”.\n"
                    + "(3). Multiplicar dos enteros positivos: Dados 2 números, calcular su producto por medio de sumas sucesivas.\n"
                    + "(4). Factorial de un número: Dado un entero positivo, calcular su factorial.\n" + "(5). Salir");

            op = leer.nextInt();
            switch (op) {
                case 1:
                    int n, n1, m, cant = 0;
                    System.out.println("Opción 1");
                    System.out.println("---------------------------");
                    System.out.println("Digite un número");
                    n = leer.nextInt();
                    n1 = n;
                    m = 0;
                    while (n > 0) {

                        if ((n % 10) > m) {
                            m = n % 10;
                        }
                        n = n / 10;
                        cant++;
                    }
                    System.out.println("---------------------------");
                    System.out.println(n1 + " tiene " + cant + " dígitos y su dígito mayor es " + m);
                    System.out.println("---------------------------");
                    break;
                case 2:
                    int valor = 0;
                    System.out.println("Opción 2");
                    System.out.println("---------------------------");
                    int numero = (int) (Math.random() * 100);
                    System.out.println("Indica un numero entre el 0 y el 100 " + numero);
                    int contador = 0;
                    do {
                        System.out.print("Indica el numero: ");
                        valor = leer.nextInt();
                        if (valor < 0 || valor > 100) {
                            System.out.println("El numero tiene que estar entre el 0 y el 100");
                        }
                        if (valor > numero) {
                            System.out.println("El numero es menor");
                        } else if (valor < numero) {
                            System.out.println("El numero es mayor");
                        }
                        contador++;
                    } while (valor != numero);

                    System.out.println("---------------------------");
                    System.out.println("Has avariguado el numero en " + contador + " intentos.");
                    System.out.println("---------------------------");
                    break;
                case 3:
                    System.out.println("Opción 3");
                    System.out.println("---------------------------");
                    int num1 = 0, num2 = 0, suma = 0;
                    System.out.print("Digite el numero 1: ");
                    num1 = leer.nextInt();
                    System.out.print("Digite el numero 2: ");
                    num2 = leer.nextInt();
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
                    System.out.println("Digite un número entero positivo");
                    nume = leer.nextInt();
                    for (int i = 1; i < nume + 1; ++i) {
                        fact = fact * i;
                    }
                    System.out.println("---------------------------");
                    System.out.println("El factorial de " + nume + " es: " + fact);
                    System.out.println("---------------------------");

                    break;
                case 5:
                    System.out.println("Adiós");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
