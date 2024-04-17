package Semester_2.Pemrograman_2.week_4;

public class Marketer extends Employee {
    public Marketer(int initialYears){
        super(initialYears);
    }
    
    public void advertise(){
        System.out.println("Act now, while supplies last!");
    }

    public double getSalary(){
        return super.getSalary() + 10000.0;
    }
}
