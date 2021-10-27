package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class opt2 {

    public static void main(String[] args) {
        JFrame jframe = getFrame();
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame();

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 350);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("This my app");

        JLabel center = new JLabel("Center", SwingConstants.CENTER);
        JLabel north = new JLabel("North", SwingConstants.CENTER);
        JLabel south = new JLabel("South", SwingConstants.CENTER);
        JLabel east = new JLabel("East", SwingConstants.CENTER);
        JLabel west = new JLabel("West", SwingConstants.CENTER);

        jFrame.add(center, BorderLayout.CENTER);
        jFrame.add(north, BorderLayout.NORTH);
        jFrame.add(south, BorderLayout.SOUTH);
        jFrame.add(east, BorderLayout.EAST);
        jFrame.add(west, BorderLayout.WEST);
        jFrame.setVisible(true);



        center.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                jFrame.setTitle("Добро пожаловать в ЦЕНТР");
            }
        });

        north.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                jFrame.setTitle("Добро пожаловать на СЕВЕР");
            }
        });

        south.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                jFrame.setTitle("Добро пожаловать на ЮГ");
            }
        });

        east.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                jFrame.setTitle("Добро пожаловать на ВОСТОК");
            }
        });

        west.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                jFrame.setTitle("Добро пожаловать на ЗАПАД");
            }
        });




        return jFrame;
    }
}
