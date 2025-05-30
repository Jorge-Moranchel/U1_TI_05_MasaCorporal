import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        persona.setNombre(nombre);

        System.out.println("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();
        persona.setAltura(altura);

        System.out.println("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();
        persona.setPeso(peso);

        double imc = persona.calcularIMC();
        String clasificacion = persona.clasificarIMC();

        System.out.println(persona.getNombre() + ", tu IMC es " + String.format("%.2f", imc));
        System.out.println("Clasificación: " + clasificacion);

        scanner.close();
    }
}
