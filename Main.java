import src.Staff;
import src.Student;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff("Nam", "nam@gmail.com", "009009090", "Ha Noi", "manager");
        Student student = new Student("Quan", "quan@gmail.com", "08787878", "Nam Dinh", "C0823H1", 7.8);

        System.out.println(staff.getInfo());
        System.out.println(staff.getSalary());
        System.out.println(student.getInfo());
    }
}
