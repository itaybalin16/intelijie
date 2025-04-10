import java.util.Arrays;

public class Department {
    private String departmentName;
    private int numOfStudent;
    private Teacher[] techersArray;

    public Department(String departmentName, int numOfStudent, Teacher[] techersArray) {
        this.departmentName = departmentName;
        this.numOfStudent = numOfStudent;
        this.techersArray = techersArray;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public void setNumOfStudent(int numOfStudent) {
        this.numOfStudent = numOfStudent;
    }

    public String[] getTechersArray() {
        return techersArray;
    }

    public void setTechersArray(String[] techersArray) {
        this.techersArray = techersArray;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", numOfStudent=" + numOfStudent +
                ", techersArray=" + Arrays.toString(techersArray) +
                '}';
    }

}