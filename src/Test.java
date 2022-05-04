import case_study.models.Employee;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        check("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\employee.csv");

        double x = 16 - 2;
        if (x < 16) {
            System.out.println("A");
        } else if (x < 15) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        Stack a = new Stack();
        System.out.println(a.isEmpty());
        System.out.println(a.empty());

//        Employee employee = new Employee();
////        System.out.println(employee.getClass().getSimpleName());
//
//        List<Object> employees = new ArrayList<>();
//        employees.add(employee);
//        System.out.println(employees.get(0).getClass().getSimpleName());

    }

    public static void check(String file) {
        if(file.contains("employee.csv")) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}


