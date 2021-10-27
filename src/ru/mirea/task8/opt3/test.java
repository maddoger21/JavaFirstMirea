package ru.mirea.task8.opt3;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(1000, 600);
        frame.setResizable(false);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int) ((dimension.getWidth() - frame.getWidth()) / 2), (int) ((dimension.getHeight() - frame.getHeight()) / 2));
        frame.setVisible(true);
        JLabel picture = new JLabel("", JLabel.CENTER);
        frame.add(picture);

        while(true) {
            frame.setBackground(Color.white);
            picture.setIcon(new ImageIcon("C:\\Users\\Vlad\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\pic1.jpg","test"));
            Thread.sleep(1000);
            frame.setBackground(Color.white);
            picture.setIcon(new ImageIcon("C:\\Users\\Vlad\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\pic2.jpg","test"));
            Thread.sleep(1000);
            frame.setBackground(Color.white);
            picture.setIcon(new ImageIcon("C:\\Users\\Vlad\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\pic3.png","test"));
            Thread.sleep(1000);
        }
    }
}
