package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // lets the window properly close when the user clicks the close ("X" button)
        window.setResizable(false); // cannot resize this window
        window.setTitle("The philosopher's Journey"); // title of the game

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel); // add this GamePanel to ourWindow
        // causes this window to be sized to fit the preferred size and layouts of its subcomponents
        window.pack();

        window.setLocationRelativeTo(null); // will be displayed at the center of the screen
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}