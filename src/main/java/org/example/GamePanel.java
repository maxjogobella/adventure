package org.example;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    /**
     * screen settings
     */
    private final int originalTileSize = 16; //16x16 tile,default size of the player character NPCs and map tiles in game
    private final int scale = 3; // it looks 48x48 px on the screen, although originalTileSize is equal 16

    private final int tileSize = originalTileSize * scale; // 48x48 tile, the actual size that will be displayed on game screen
    private final int maxScreenCol = 16; // horizontally
    private final int maxScreenRow = 12; // vertically
    /**
     * This will be the size of game screen
     */
    private final int screenWidth = tileSize * maxScreenCol; // 768 px
    private final int screenHeight = tileSize * maxScreenRow; // 576 px

    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight)); // set the panel size of GamePanel
        this.setBackground(Color.BLACK); // set the background color of this GamePanel
        this.setDoubleBuffered(true); // all the drawing will be done in offscreen painting buffer, can improve game's rendering performance
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() { // the core of game

        while (gameThread != null) {

            update();
            repaint();
        }

    }


    // update information such as character position
    public void update() {

    }

    // draw the screen with the updated information
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

    }
}
