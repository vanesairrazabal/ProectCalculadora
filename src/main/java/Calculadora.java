import java.util.Scanner;

public class Calculadora {

    int resultado;
    int num1;
    int num2;
    static Scanner scanner = new Scanner(System.in);
    public void solicitarDatos(){
        System.out.println("Solicitar numero1");
        num1 = scanner.nextInt();
        System.out.println("Solicitar numero2");
        num2 = scanner.nextInt();
    }

    public void mostrarResultados(){
        System.out.println("El resultado es: " + resultado);

    }
}
