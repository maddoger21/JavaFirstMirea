package ru.mirea.task11.opt1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opt1 {
    static int asnwer =1+  (int)(Math.random()+19);
    static int attempts = 3;
    static int countOfAttempt = 3;
    static int maxNumber = 20;

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

        JLabel labelTry = new JLabel("Попыток осталось: " + attempts);
        labelTry.setBounds(265,30,100,20);

        JLabel labelGuess = new JLabel("");
        labelGuess.setBounds(222,130,300,20);

        JButton buttonGuess = new JButton("Ответить");
        buttonGuess.setBounds(250,230,100,30);


        JTextField input = new JTextField(10);
        input.setBounds(200,200,200,20);


        JLabel current = new JLabel("Всего Кол-во попыток - " + countOfAttempt + " Макс число - " + maxNumber);
        current.setBounds(200,10,400,20);


        jFrame.setLayout(null);
        jFrame.add(current);
        jFrame.add(labelTry);
        jFrame.add(labelGuess);
        jFrame.add(buttonGuess);
        jFrame.add(input);
        jFrame.setVisible(true);


        buttonGuess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int x1 = Integer.parseInt(input.getText().trim());
                    input.setText("");

                    if (x1 == asnwer) {
                        JOptionPane.showMessageDialog(null, "Поздравляю! Ты отгадал!", "Победа", JOptionPane.INFORMATION_MESSAGE);
                        attempts = countOfAttempt;
                        labelGuess.setText("");
                        labelTry.setText("Попыток осталось - " + attempts);
                    } else if (x1 > asnwer) {
                        attempts--;
                        labelTry.setText("Попыток осталось - " + attempts);
                        labelGuess.setText("Число " + x1 + " больше загаданного");
                    } else {
                        attempts--;
                        labelTry.setText("Попыток осталось - " + attempts);
                        labelGuess.setText("Число " + x1 + " меньше загаданного");
                    }
                    if (attempts == 0) {
                        JOptionPane.showMessageDialog(null, "Проиграл!Загаданное число - " + asnwer + "\n Попробуй снова", "Проигрыш", JOptionPane.INFORMATION_MESSAGE);
                        attempts = countOfAttempt;
                        labelGuess.setText("");
                        labelTry.setText("Попыток осталось - " + attempts);
                    }
                }
                catch(Exception a) {
                    JOptionPane.showMessageDialog(null, "Введите число", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }

            }
        });



        return jFrame;
    }
}
