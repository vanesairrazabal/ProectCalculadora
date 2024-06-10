import java.util.Scanner;

public class Main {

    static Calculadora miCalculadora = new Calculadora();
    static Sumar miSuma = new Sumar();


    public static void main(String[] args) {
        miSuma.solicitarDatos();
        miSuma.suma(miSuma.num1, miSuma.num2);
        miSuma.mostrarResultados();
    }
}
