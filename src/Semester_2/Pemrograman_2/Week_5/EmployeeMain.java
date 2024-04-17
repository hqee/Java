package Semester_2.Pemrograman_2.Week_5;

public class EmployeeMain {
    public static void main(String[] args) {
        Lawyer lisa = new Lawyer(00);
        Secretary steve = new Secretary(0);
        printInfo(lisa);
        printInfo(steve);
    }
	
    public static void printInfo(Employee empl) {
        System.out.println("salary: " + empl.getSalary());
        System.out.println("v.days: " + empl.getVacationDays());
        System.out.println("v.form: " + empl.getVacationForm());
        System.out.println();
    }
}

