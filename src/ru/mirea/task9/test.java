package ru.mirea.task9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    static int goalA = 0;
    static int goalB = 0;
    public static void main(String[] args) {
        JFrame jframe = getFrame();
    }



    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 350);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("This my app");

        JLabel labelResult = new JLabel("Result: " + goalA + " x " + goalB);
        labelResult.setBounds(250,30,100,10);
        JLabel labelLast = new JLabel("Last Scorer: N/A");
        labelLast.setBounds(250,50,200,10);
        JLabel labelWinner = new JLabel("Winner: N/A");
        labelWinner.setBounds(250,70,200,10);
        JButton buttonA = new JButton("Team A");
        JButton buttonB = new JButton("Team B");
        //JButton buttonRST = new JButton("RESET");

        buttonB.setBounds(310,250,150,30);
        buttonA.setBounds(140,250,150,30);
        //buttonRST.setBounds(30,30,100,30);

        jFrame.add(buttonA);
        jFrame.add(buttonB);
        //jFrame.add(buttonRST);
        jFrame.add(labelResult);
        jFrame.add(labelLast);
        jFrame.add(labelWinner);



        buttonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goalA++;
                labelResult.setText("Result: " + goalA + " x " + goalB);
                labelLast.setText("Last Scorer: Team A");
                if (goalA > goalB) {
                    labelWinner.setText("Winner: Team A");
                } else {
                    if (goalB > goalA) {
                        labelWinner.setText("Winner: Team B");
                    } else {
                        labelWinner.setText("Winner: Draw");
                    }
                }
            }
        });

        buttonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goalB++;
                labelResult.setText("Result: " + goalA + " x " + goalB);
                labelLast.setText("Last Scorer: Team B");
                if (goalA > goalB) {
                    labelWinner.setText("Winner: Team A");
                }
                else {
                    if(goalB > goalA) {
                        labelWinner.setText("Winner: Team B");
                    }
                    else {
                        labelWinner.setText("Winner: Draw");
                    }
                }
            }
        });



        return jFrame;
    }
}
