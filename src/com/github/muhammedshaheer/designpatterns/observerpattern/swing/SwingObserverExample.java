package com.github.muhammedshaheer.designpatterns.observerpattern.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {

    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go() {
        jFrame = new JFrame();

        jFrame.setBounds(0, 0, 10, 10);

        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
    }

    static class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    static class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }
}
