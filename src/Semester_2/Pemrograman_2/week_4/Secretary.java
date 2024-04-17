package Semester_2.Pemrograman_2.week_4;

public class Secretary extends Employee{
    public Secretary(int initialYears){
        super(0);
    }
    
    public int getSeniorityBonus(){
        return 0;
    }
    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }
}
