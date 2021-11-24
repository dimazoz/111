package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main2 extends JFrame {

    JLabel w = new JLabel("This is West");
    JLabel c = new JLabel("This is Center");
    JLabel s = new JLabel("This is South");
    JLabel e = new JLabel("This is East");
    JLabel n = new JLabel("This is North");

    public Main2(){

        setTitle("Task2");
        setPreferredSize(new Dimension(1920, 1080));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cn = getContentPane();
        cn.setLayout(new BorderLayout());

        w.setHorizontalAlignment(0);
        c.setHorizontalAlignment(0);
        s.setHorizontalAlignment(0);
        e.setHorizontalAlignment(0);
        n.setHorizontalAlignment(0);

        cn.add(BorderLayout.CENTER, c);
        cn.add(BorderLayout.NORTH, n);
        cn.add(BorderLayout.EAST, e);
        cn.add(BorderLayout.WEST, w);
        cn.add(BorderLayout.SOUTH, s);

        c.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Main2.this, "<h1>Welcome to Center<h1>");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        s.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Main2.this, "<h1>Welcome to South<h1>");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        n.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Main2.this, "<h1>Welcome to North<h1>");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        e.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Main2.this, "<h1>Welcome to East<h1>");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        w.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(Main2.this, "<h1>Welcome to West<h1>");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main2();
    }
}
