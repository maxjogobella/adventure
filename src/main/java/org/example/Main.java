package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // lets the window properly close when the user
        // clicks the close ("X" button)
        window.setResizable(false); // cannot resize this window
        window.setTitle("The philosopher's Journey"); // title of the game
        window.setLocationRelativeTo(null); // will be displayed at the center of the screen
        window.setVisible(true);
    }
}