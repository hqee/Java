package Semester_2.Pemrograman_2.Week_5;

public class Employee {
    private int years;
    
    public Employee(int initialYears) {
        years = initialYears;
    }
    
    public int getYears() {
        return years;
    }   
    
    public int getHours() {
        return 40;
    }
    
    public double getSalary() {
        return 50000.0;
    }
    
    public int getVacationDays() {
        return 10 + 2 * years;
    }

    public int getSeniorityBonus() {
        return 2 * years;
    }

    public String getVacationForm() {
        return "yellow";
    }
}
