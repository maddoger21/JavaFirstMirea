package ru.mirea.task8.opt2;
import javax.swing.*;
import java.awt.*;

public class Task2 {
    public static void main(String[] args) {
        JFrame frame = getFrame();
        JPanel jPanel = new JPanel();
        JLabel picture = new JLabel("", JLabel.CENTER);
        frame.add(picture);
        picture.setIcon(new ImageIcon(args[0],"test"));
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