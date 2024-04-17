package Semester_2.Pemrograman_2.week_3;

import java.awt.Color;
import java.awt.Graphics2D;

public class Point {
    private int x;
    private int y;
    private boolean affected;  

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.affected = false;  
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isAffected() {
        return affected;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void markAsAffected() {
        this.affected = true;
    }

    public void checkAndMarkAffected(Point bomb, int radius) {
        int dx = this.x - bomb.getX();
        int dy = this.y - bomb.getY();
        double distance = Math.sqrt(dx * dx + dy * dy);

        if (distance <= radius) {
            markAsAffected();
        }
    }

    public double distanceTo(Point other) {
        int dx = this.x - other.getX();
        int dy = this.y - other.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void draw(Graphics2D g) {
        if (affected) {
            g.setColor(Color.RED); 
        } else {
            g.setColor(Color.BLUE);
        }
        g.drawString(String.format("(%d, %d)", x, y), x + 5, y - 5);
    }
}
