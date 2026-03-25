import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private List<StudentModel> students = new ArrayList<>();

    // Crear
    public void createStudent(int id, String name, int age) {
        students.add(new StudentModel(id, name, age));
    }

    // Listar
    public void getAllStudents() {
        for (StudentModel s : students) {
            System.out.println(s);
        }
    }

    // Buscar por ID
    public StudentModel getStudentById(int id) {
        for (StudentModel s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Eliminar
    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }
}