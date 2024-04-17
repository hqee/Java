package Semester_2.Pemrograman_2.Week_5;

public class LegalSecretary extends Secretary{    
    public LegalSecretary(int initialYears) {
        super(initialYears);
    }

    public void fileLegalBriefs(){
        System.out.println("I could file all day!");
    }

    public double getSalary(){
        double baseSalary = super.getSalary();  
        return baseSalary + 5000.0;
    }
}

