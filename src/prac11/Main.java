package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    JTextField numberInput = new JTextField(2);
    JButton guessButton = new JButton("Guess");
    JLabel guessResult = new JLabel("");
    int key = 14;
    int tries = 0;

    public Main() {

        setTitle("Task1");
        setPreferredSize(new Dimension(640, 480));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(numberInput);
        c.add(guessButton);
        c.add(guessResult);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Integer.parseInt(numberInput.getText()) == key){
                    guessResult.setText("You win!");
                }
                if (Integer.parseInt(numberInput.getText()) > key){
                    guessResult.setText("The key is smaller");
                    tries++;
                }
                if (Integer.parseInt(numberInput.getText()) < key) {
                    guessResult.setText("The key is bigger");
                    tries++;
                }
                if (tries >= 3){
                    guessResult.setText("You lose!");
                }
            }
        });

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
