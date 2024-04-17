package learn_java.dasar_1;

public class switchStatement {
    public static void main(String[] args) {
        var nilai = "E";
        String ucapan;

        switch (nilai) {
            case "A":
                System.out.println("Selamat Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup");
                break;
            default:
                System.out.println("Maaf anda tidak lulus");
                break;
        }

        switch (nilai) {
            case "A" -> System.out.println("Selamat anda lulus dengan baik");
            case "B", "C" -> System.out.println("nilai anda cukup");
            default -> {
                System.out.println("Maaf anda tidak lulus");
                System.out.println("Silahkan mengulang tahun depan");
            } 
        }

        switch (nilai) {
            case "A" -> ucapan = "Selamat anda lulus dengan baik";
            case "B", "C" -> ucapan = "nilai anda cukup";
            default -> {
                ucapan = "Maaf anda tidak lulus";
                ucapan = "Silahkan mengulang tahun depan";
            } 
        }
        System.out.println(ucapan);

        ucapan = switch (nilai) {
            case "A":
                yield "Selamat anda lulus dengan baik";
            case "B", "C":
                yield "nilai anda cukup";
            default:
                yield "Maaf anda tidak lulus\nSilahkan mengulang tahun depan";
        };
        System.out.println(ucapan);
    }
}
