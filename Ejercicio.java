import java.util.Scanner;

public class Ejercicio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;

    do {
      System.out.println("Seleccione un ejercicio:");
      System.out.println("1. Ejercicio 1");
      System.out.println("2. Ejercicio 2");
      System.out.println("3. Ejercicio 3");
      System.out.println("4. Ejercicio 4");
      System.out.println("5. Ejercicio 5");
      System.out.println("6. Ejercicio 6");
      System.out.println("7. Ejercicio 7");
      System.out.println("8. Ejercicio 8");
      System.out.println("9. Ejercicio 9");
      System.out.println("0. Salir");
      System.out.print("Opción: ");
      opcion = sc.nextInt();

      switch (opcion) {
        case 1:
          ejercicio1(args);
          break;
        case 2:
          ejercicio2(args);
          break;
        case 3:
          ejercicio3(args);
          break;
        case 4:
          ejercicio4(args);
          break;
        case 5:
          ejercicio5(args);
          break;
        case 6:
          ejercicio6(args);
          break;
        case 7:
          ejercicio7(args);
          break;
        case 0:
          System.out.println("Hasta pronto");
          break;
        default:
          System.out.println("Opción inválida");
          break;
      }
    } while (opcion != 0);
  }

  public static void ejercicio1(Object args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[5];

    System.out.println("Introduzca 5 números:");
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = sc.nextInt();
    }

    System.out.println("Los números introducidos son:");
    for (int i = 0; i < numeros.length; i++) {
      System.out.println(numeros[i]);
    }
    // Código del ejercicio 1
    /*
     * Utilizo la clase Scanner para saber los numero intoducido por el usuario,
     * creo una matriz de 5 elementos, luego utiliza un bucle for para leer los
     * números y almacenarlos en la matriz, despues printea los números en el mismo
     * orden de entrada utilizando otro bucle for.
     */
  }

  public static void ejercicio2(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[5];

    System.out.println("Introduzca 5 números:");
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = sc.nextInt();
    }

    System.out.println("Los números introducidos en orden inverso son:");
    for (int i = numeros.length - 1; i >= 0; i--) {
      System.out.println(numeros[i]);
    }
    // Código del ejercicio 2
    /*
     * Utilizo la clase Scanner para saber los numero intoducido por el usuario,
     * el primer bucle for es para leer 5 números y almacenarlos en la
     * matriz "numeros", utiliza otro bucle for para printea los números en el mismo
     * orden de entrada, despues revertimos la posicion y printeamos.
     */
  }

  public static void ejercicio3(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[5];
    int pos = 0, neg = 0, cero = 0;
    int i;

    System.out.println("Introduzca 5 números: ");
    for (i = 0; i < numeros.length; i++) {
      System.out.print("numeros= ");
      numeros[i] = sc.nextInt();
    }

    for (i = 0; i < numeros.length; i++) {
      if (numeros[i] > 0) {
        pos++;
      } else if (numeros[i] < 0) {
        neg++;
      } else {
        cero++;
      }
    }

    System.out.println("Positivos: " + pos);
    System.out.println("Negativos: " + neg);
    System.out.println("Ceros: " + cero);

    // Código del ejercicio 3
    /*
     * Utilizo la clase Scanner para leer los numeros intoducido por el usuario,
     * lo primero es dejar los valores predeterminados en cero,
     * en el primero for leemos loa valores que se introducen por teclado y se
     * guardan en el array, en el segundo for se recoore el array para contar los
     * positivos, negativos y ceros, despues se printea todo
     */
  }

  public static void ejercicio4(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un texto: ");
    String texto = sc.nextLine();
    int cantidad = contar(texto);
    System.out.println("El texto tiene " + cantidad + " caracteres.");
  }

  public static int contar(String texto) {
    return texto.length();
  }

  // Código del ejercicio 4
  /*
   * Utilizo la clase Scanner para leer un texto intoducido por el usuario,
   * llamo al método "contar()" que recibe el texto como parámetro y
   * utiliza el método "length()" para contar los caracteres,
   * el resultado se guarda en "cantidad" y se printea.
   */

  public static void ejercicio5(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un texto: ");
    String texto = sc.nextLine();
    String invertido = invertir(texto);
    System.out.println("El texto invertido es: " + invertido);
  }

  public static String invertir(String texto) {
    StringBuilder sb = new StringBuilder(texto);
    return sb.reverse().toString();
  }
  // Código del ejercicio 5
  /*
   * Utilizo la clase Scanner para leer un texto intoducido por el usuario,
   * llamo al método "invertirTexto()"" que recibe el texto como parámetro y
   * utiliza "StringBuilder" para invertir los caracteres del texto,
   * el resultado se guarda en "textoInvertido" y se printea.
   */

  public static void ejercicio6(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un texto: ");
    String texto = sc.nextLine();
    String sinEspacios = eliminar(texto);
    System.out.println("El texto sin espacios es: " + sinEspacios);
  }

  public static String eliminar(String texto) {
    return texto.replaceAll("\\s", "");
  }
  // Código del ejercicio 6
  /*
   * Utilizo la clase Scanner para leer un texto introducido por el usuario,
   * llamo al método "eliminarEspacios()" que recibe el texto como parámetro y
   * utiliza el método "replaceAll()" para eliminar los espacios en blanco.
   * el resultado se guarda en "textoSinEspacios" y se printea.
   */

  public static void ejercicio7(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la primera cadena: ");
    String cadena1 = sc.nextLine();
    System.out.print("Introduce la segunda cadena: ");
    String cadena2 = sc.nextLine();
    String resultado = cadenas(cadena1, cadena2);
    System.out.println("El resultado de la concatenación es: " + resultado);
  }

  public static String cadenas(String cadena1, String cadena2) {
    return cadena1 + cadena2;
  }
  // Código del ejercicio 7
  /*
   * Utilizo la clase Scanner para leer las dos cadena introducidas por el
   * usuario, llamo al método "concatenarCadenas()" que recibe las dos cadenas
   * como parámetros y las concatena, el resultado se guarda en "resultado" y se
   * printea.
   */
}
