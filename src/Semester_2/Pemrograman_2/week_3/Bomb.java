package Semester_2.Pemrograman_2.week_3;

import java.awt.*;
import java.io.*;
import java.util.*;

public class Bomb {   
  public static void main(String[] args) throws FileNotFoundException {
    DrawingPanel panel = new DrawingPanel(200, 200);
    java.awt.Graphics2D g = panel.getGraphics();
    
    generateAndSaveCities();

    try (Scanner input = new Scanner(new File("cities5.txt"))) {
      Point[] cities = readCities(input, g);

      try (Scanner console = new Scanner(System.in)) {
        Point bomb = new Point(0, 0);
        System.out.print("Blast site x? ");
        bomb.setX(console.nextInt());
        System.out.print("Blast site y? ");
        bomb.setY(console.nextInt());
        System.out.print("Blast radius? ");
        int radius = console.nextInt();
        boom(bomb, radius, cities, g);
      }
    }
  }

  public static void generateAndSaveCities() {
    int numCities = (int) (Math.random() * 51) + 50; // Random number of cities between 50 and 100

    try (PrintWriter writer = new PrintWriter(new FileWriter("cities5.txt"))) {
      writer.println(numCities);

      for (int i = 0; i < numCities; i++) {
        int randomX = (int) (Math.random() * 200);
        int randomY = (int) (Math.random() * 200);
        writer.println(randomX + " " + randomY);
      }

    } catch (IOException e) {
        e.printStackTrace();
    }
  }

  public static Point[] readCities(Scanner input, java.awt.Graphics2D g) {
    int numCities = input.nextInt(); 
    Point[] cities = new Point[numCities];
    for (int i = 0; i < cities.length; i++) {

      cities[i] = new Point(i, i);
      cities[i].setX(input.nextInt()); 
      cities[i].setY(input.nextInt());

      g.setColor(Color.BLUE);

        g.drawString(String.format("(%d, %d)", cities[i].getX(), cities[i].getY()),
        cities[i].getX() + 5, cities[i].getY() - 5); 
      }
  return cities;
  }

  public static int boom(Point bomb, int radius, Point[] cities, java.awt.Graphics2D g) {
    g.setColor(Color.RED);
    g.drawOval(bomb.getX() - radius, bomb.getY() - radius, 2 * radius, 2 * radius);
    int affectedCount = 0;
    for (int i = 0; i < cities.length; i++) {
      cities[i].checkAndMarkAffected(bomb, radius);
      if (cities[i].isAffected()) {
        cities[i].draw(g);
        affectedCount++;
      }
    }
    int unaffectedCount = cities.length - affectedCount;
    System.out.println("=============================");
    System.out.println("Jumlah kota yang terkena bom: " + affectedCount);
    System.out.println("Jumlah kota yang tidak terkena bom: " + unaffectedCount);
    return affectedCount;
  }

  @Override
  public String toString() {
    return "Bomb []";
  }
}
