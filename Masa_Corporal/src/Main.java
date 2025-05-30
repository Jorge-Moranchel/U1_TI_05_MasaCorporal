import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona();

        
        System.out.print("Ingrese su nombre: ");
        persona.setNombre(scanner.nextLine());

        System.out.println("Ingrese su altura: ");
        persona.setAltura(scanner.nextDouble());

        System.out.print("Ingrese su peso en kg: ");
        persona.setPeso(scanner.nextDouble());

        double imc = persona.calcularIMC();
        String clasificacion = persona.clasificarIMC();

        System.out.printf("%s, tu IMC es %.2f y estás en la categoría: %s\n",persona.getNombre(), imc, clasificacion);

        scanner.close();
    }
}
