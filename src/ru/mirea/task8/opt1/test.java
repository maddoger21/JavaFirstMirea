package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class test {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            for (int i = 1; i <= 20; i++){
                int figure = 1+ (int) (Math.random()*3);
                switch (figure){
                    case 1: // Circle
                        drawCircle(g2);
                        break;
                    case 2: //Rectangle
                        drawRect(g2);
                        break;
                    case 3: // Triangle
                        drawTriangle(g2);
                        break;
                }
            }

        }
    }

    static void drawTriangle(Graphics2D g2){
        Triangle triangle = getTriangle();
        double angle = aAngle(triangle);
        g2.setPaint(getPaint(triangle.color));
        g2.fillPolygon(new int[]{(int)triangle.posx, (int) (Math.cos(angle) * triangle.getC()), (int)triangle.posx+(int)triangle.getA() }, new int[]{(int)triangle.posy,(int) (Math.sin(angle) * triangle.getC()), (int)triangle.posy }, 3);

    }

    static double aAngle(Triangle t) {
        return Math.acos(-(Math.pow(t.getA(), 2) - Math.pow(t.getB(), 2) - Math.pow(t.getC(), 2)) / (2 * t.getB() * t.getC()));
    }
    static void drawRect(Graphics2D g2){
        Rectangle rectangle = getRect();
        Rectangle2D rectangle2D = new Rectangle2D.Double(rectangle.posx, rectangle.posy, rectangle.getWidth(),rectangle.getHeight());
        g2.setPaint(getPaint(rectangle.color));
        g2.draw(rectangle2D);

    }

    static void drawCircle(Graphics2D g2){
        Circle circle = getCircle();
        double x = circle.getPosx() - (circle.getRadius()/2);
        double y = circle.getPosy() - (circle.getRadius()/2);
        g2.setPaint(getPaint(circle.color));
        g2.drawOval((int)x,(int)y,(int)circle.getRadius(),(int)circle.getRadius());
    }
    static Triangle getTriangle(){
        double posX = 1+ (Math.random()*1200);
        double posY = 1+ (Math.random()*600);
        double a = 200+ (Math.random()*400);
        double b = 100+ (Math.random()*400);
        double c = 100 +(Math.random()*(a+b-100));
        Triangle triangle = new Triangle(getCol(), posX, posY, a, b, c);
        return triangle;
    }

    static Rectangle getRect(){ // получаем рандомнын значения прямоугольника
        double posX = 1+ (Math.random()*1200);
        double posY = 1+ (Math.random()*600);
        double width = 100+ (Math.random()*400);
        double height = 100+ (Math.random()*400);
        Rectangle rectangle = new Rectangle(getCol(), posX, posY, width, height);
        return rectangle;
    }

    static Circle getCircle(){ //получаем рандомные значения круга
        double posX = 1+ (Math.random()*1600);
        double posY = 1+ (Math.random()*1000);
        double rad = 100+ (Math.random()*400);
        Circle circle = new Circle(getCol(), posX, posY, rad);
        return circle;
    }

    static Paint getPaint(String color){ // Преобразуем Цвет строкового типа в тип Paint
        switch (color){
            case "red":
                return Color.red;
            case "blue":
                return Color.blue;
            default:
                return Color.green;
        }
    }


    static String getCol(){
        int color = 1+ (int) (Math.random()*3);
        switch (color){
            case 1:
                return "red";
            case 2:
                return "blue";
            default:
                return "green";
        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1600, 1000);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("This my app");
        return jFrame;
    }
}
