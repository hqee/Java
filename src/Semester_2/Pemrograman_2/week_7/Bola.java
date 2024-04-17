package Semester_2.Pemrograman_2.week_7;

public class Bola {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(jariJari, 3);
    }
}
