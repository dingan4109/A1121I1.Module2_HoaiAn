package case_study.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Employee extends Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String educationLevel;
    private String position;
//    private BigDecimal salary; REFERENCE FOR NOW ONLY
    private int salary;

    public final String UNIVERSITY = "University Degree";
    public final String COLLEGE = "College Degree";
    public final String INTERMEDIATE = "Intermediate Diploma";
    public final String POSTGRADUATES = "Postgraduates Degree";

    public final String RECEPTIONIST = "Receptionist";
    public final String WAITER = "Waiter/Waitress";
    public final String EXPERT = "Expert";
    public final String SUPERVISOR = "Supervisor";
    public final String MANAGER = "Manager";
    public final String DIRECTOR = "Director";

    public Employee() {}

    public Employee(String id, String fullName, String birthday, String gender, int idCardNumber, int phoneNumber,
                    String email, String educationLevel, String position, int salary) {
        super(id, fullName, birthday, gender, idCardNumber, phoneNumber, email);
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", educationLevel='" + educationLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
