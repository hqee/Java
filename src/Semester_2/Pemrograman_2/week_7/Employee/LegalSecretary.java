package Semester_2.Pemrograman_2.week_7.Employee;

public class LegalSecretary extends Secretary{    
    public LegalSecretary(int Years) {
        super(Years);
    }

    public void fileLegalBriefs(){
        System.out.println("I could file all day!");
    }

    public double getSalary(){
        return super.getSalary() + 5000.0;
    }
}

