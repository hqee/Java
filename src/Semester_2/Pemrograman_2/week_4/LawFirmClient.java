package Semester_2.Pemrograman_2.week_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LawFirmClient {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            employees.add(new Lawyer(8));
        }

        for (int i = 0; i < 2; i++) {
            employees.add(new Secretary(4));
        }

        employees.add(new LegalSecretary(3));

        for (int i = 0; i < 4; i++) {
            employees.add(new Marketer(7));
        }

        Map<String, Double> totalSalaryByEmployee = new HashMap<>();
        Map<String, Integer> vacationDaysByEmployee = new HashMap<>();

        for (Employee employee : employees) {
            String employeeType = getEmployeeType(employee);
            double salary = employee.getSalary(); // Retrieves annual salary

            totalSalaryByEmployee.put(employeeType, salary);
            vacationDaysByEmployee.put(employeeType, employee.getVacationDays());
        }

        totalSalaryByEmployee.forEach((employeeType, totalSalary) -> {
            System.out.println("Total gaji per tahun untuk " + employeeType + ": $" + totalSalary);
            System.out.println("Jumlah hari cuti: " + vacationDaysByEmployee.get(employeeType));
            System.out.println("========================");
        });
    }

    private static String getEmployeeType(Employee employee) {
        if (employee instanceof Lawyer) {
            return "Lawyer";
        } else if (employee instanceof Secretary) {
            return "Secretary";
        } else if (employee instanceof LegalSecretary) {
            return "Legal Secretary";
        } else if (employee instanceof Marketer) {
            return "Marketer";
        } else {
            return "Unknown";
        }
    }
}
