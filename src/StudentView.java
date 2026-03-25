import java.util.Scanner;

public class StudentView {

    private Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\n=== MENÚ DE ESTUDIANTES ===");
        System.out.println("1. Crear estudiante");
        System.out.println("2. Listar estudiantes");
        System.out.println("3. Buscar estudiante por ID");
        System.out.println("4. Eliminar estudiante");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public int inputId() {
        System.out.print("Ingrese ID del estudiante: ");
        return scanner.nextInt();
    }

    public String inputName() {
        scanner.nextLine();
        System.out.print("Ingrese nombre del estudiante: ");
        return scanner.nextLine();
    }

    public int inputAge() {
        System.out.print("Ingrese edad del estudiante: ");
        return scanner.nextInt();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showStudent(StudentModel student) {
        if (student != null) {
            System.out.println("Estudiante encontrado: " + student);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
// cambio en el reposirorio Diego Sotelo - 2024-06-15