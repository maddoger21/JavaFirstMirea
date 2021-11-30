package ru.mirea.task16.project;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        JLabel characterLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon("src/ru/mirea/task16/project/drawable/character.png");
        characterLabel.setIcon(imageIcon);
        characterLabel.setHorizontalAlignment(JLabel.CENTER);
        characterLabel.setVerticalAlignment(JLabel.CENTER);
        characterLabel.setOpaque(true);
        characterLabel.setBounds(350,350);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 800);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Tamagotchi");
        this.add(characterLabel);
    }
}
