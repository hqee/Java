package learn_java.dasar_1;

public class operasiBoolean {
    public static void main(String[] args) {
        var absen = 75;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
