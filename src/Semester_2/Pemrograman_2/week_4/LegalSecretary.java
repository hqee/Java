package Semester_2.Pemrograman_2.week_4;

public class LegalSecretary extends Employee{    
    public LegalSecretary(int initialYears) {
        super(initialYears);
    }

    public void fileLegalBriefs(){
        System.out.println("I could file all day!");
    }

    public double getSalary(){
        return super.getSalary() + 5000.0;
    }
}
