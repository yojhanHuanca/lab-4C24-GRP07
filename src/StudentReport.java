import java.util.List;

public class StudentReport {

    // Mostrar todos los estudiantes
    public void showStudents(List<StudentModel> students) {
        if (students.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("=== LISTA DE ESTUDIANTES ===");
            for (StudentModel s : students) {
                System.out.println(s);
            }
        }
    }

    // Mostrar cantidad total
    public void showTotalStudents(List<StudentModel> students) {
        System.out.println("Total de estudiantes: " + students.size());
    }

    // Mostrar estudiantes mayores de edad
    public void showAdults(List<StudentModel> students) {
        System.out.println("=== ESTUDIANTES MAYORES DE EDAD ===");
        for (StudentModel s : students) {
            if (s.getAge() >= 18) {
                System.out.println(s);
            }
        }
    }
}
