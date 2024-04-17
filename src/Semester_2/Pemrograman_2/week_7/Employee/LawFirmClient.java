package Semester_2.Pemrograman_2.week_7.Employee;

public class LawFirmClient {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[17];
        
        for (int i = 0; i < 10; i++) {
            employeeArray[i]=(new Lawyer(8));
        }

        for (int i = 0; i < 2; i++) {
            employeeArray[i]=(new Secretary(4));
        }

        employeeArray[1] = new LegalSecretary(3);

        for (int i = 0; i < 4; i++) {
            employeeArray[i]=(new Marketer(7));
        }


        
        int totalSalaryLawyer = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] instanceof Lawyer) {
                totalSalaryLawyer += employeeArray[i].getSalary() * 10;
            }
        }
        System.out.println("Total gaji seluruh lawyer dalam 1 tahun: $" + totalSalaryLawyer); // ((8* 5000) + 50000) * 10 = 900000



        // for (Employee employee : employees) {
        //     String employeeType = getEmployeeType(employee);
        //     double salary = employee.getSalary(); // Retrieves annual salary

        //     totalSalaryByEmployee.put(employeeType, salary);
        //     vacationDaysByEmployee.put(employeeType, employee.getVacationDays());
        // }

        // totalSalaryByEmployee.forEach((employeeType, totalSalary) -> {
        //     System.out.println("Total gaji per tahun untuk " + employeeType + ": $" + totalSalary);
        //     System.out.println("Jumlah hari cuti: " + vacationDaysByEmployee.get(employeeType));
        //     System.out.println("========================");
        // });
    }

    // private static String getEmployeeType(Employee employee) {
    //     if (employee instanceof Lawyer) {
    //         return "Lawyer";
    //     } else if (employee instanceof Secretary) {
    //         return "Secretary";
    //     } else if (employee instanceof LegalSecretary) {
    //         return "Legal Secretary";
    //     } else if (employee instanceof Marketer) {
    //         return "Marketer";
    //     } else {
    //         return "Unknown";
    //     }
    // }
}
