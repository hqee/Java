package Semester_2.Pemrograman_2.week_7;

import java.util.Random;

public class clientBola {
    public static void main(String[] args) {
        Bola[] bolaArray = new Bola[10]; 
        double totalVolume = 0;

        Random random = new Random();

        for (int b = 0; b < bolaArray.length; b++) {
            double randomJari = 2 + (random.nextDouble() * (15 - 2));
            bolaArray[b] = new Bola(randomJari);
            double volume = bolaArray[b].getVolume();
            System.out.println("Volume bola ke-" + (b+1) + " adalah : " + volume + " dengan jari jari : " + bolaArray[b].getJariJari());
            totalVolume += volume;
        }
        System.out.println("=======================================================");
        System.out.println("Total volume bola adalah : " + totalVolume);
    }
}
