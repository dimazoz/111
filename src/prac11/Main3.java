package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main3 extends JFrame {

    JTextArea input = new JTextArea();
    JMenuBar menu = new JMenuBar();

    public Main3(){

        input.setFont(new Font("Arial", Font.PLAIN, 14));

        setTitle("Task3");
        setPreferredSize(new Dimension(1920, 1080));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cn = getContentPane();
        cn.setLayout(new FlowLayout());

        JMenuItem itmRed = new JMenuItem("Set Red");
        JMenuItem itmBlue = new JMenuItem("Set Blue");
        JMenuItem itmGreen = new JMenuItem("Set Green");
        JMenuItem itmArial = new JMenuItem("Set Arial");
        JMenuItem itmCalibri = new JMenuItem("Set Calibri");
        JMenuItem itmTimes = new JMenuItem("Set Times new Roman");

        JMenu color = new JMenu("Color");
        JMenu font = new JMenu("Font");

        color.add(itmRed);
        color.addSeparator();
        color.add(itmBlue);
        color.addSeparator();
        color.add(itmGreen);

        font.add(itmArial);
        font.addSeparator();
        font.add(itmCalibri);
        font.addSeparator();
        font.add(itmTimes);

        itmRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setForeground(new Color(255, 0, 0));
            }
        });

        itmBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setForeground(new Color(0, 0, 255));
            }
        });

        itmGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setForeground(new Color(0, 255, 0));
            }
        });

        itmArial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setFont(new Font("Arial", Font.PLAIN, 14));
            }
        });

        itmCalibri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setFont(new Font("Calibri", Font.PLAIN, 14));
            }
        });

        itmTimes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setFont(new Font("Times new Roman", Font.PLAIN, 14));
            }
        });

        menu.add(color);
        menu.add(font);

        cn.add(input);
        cn.add(menu);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main3();
    }
}
