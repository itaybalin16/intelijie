import java.util.Objects;

public class Teacher {

    public enum AcademicRank{
        None,
        BSC,
        MSC,
        DR,
        PROF,
    }

    private String name;
    private String id;
    private AcademicRank degree;
    private String degreeName;
    private int salary;
    private String department;

    public Teacher(String teacherFullName, String id, AcademicRank degree, String degreeName, int salary) {
        this.name = teacherFullName;
        this.id = id;
        this.degree = degree;
        this.degreeName = degreeName;
        this.salary = salary;
    }

    public Teacher(String teacherFullName, String id, AcademicRank degree, String degreeName, int salary, String department) {
        this(teacherFullName, id, degree, degreeName, salary);
        this.department = department;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teachers = (Teacher) o;
        return id == teachers.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "teacherFullName='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", degreeName='" + degreeName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }



    public void setSalary(int salary) {
        salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AcademicRank getDegree() {
        return degree;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}